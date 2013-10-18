package ige.integration.webservice;


import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;
import ige.integration.domain.ReservationDetails;
import ige.integration.messages.Messages;
import ige.integration.service.GuestInfoService;
import ige.integration.service.GuestStayInfoService;
import ige.integration.service.GuestTransactionsService;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class SoapOperationService {
    private static final String HELLO = "Hello";
    @Autowired
	private GuestInfoService guestInfoService;
    
    @Autowired
	private GuestStayInfoService guestInfoStayService;
    
    @Autowired
	private GuestTransactionsService guestTransactionsService;

    @WebMethod(operationName = "sayHello")
    public String sayHelloToTheUser(@WebParam(name = "name") String userName) {
        return HELLO + " " + userName;
    }
    
    @WebMethod(operationName = "getBillInfo")
    public Object getBillInfo(@WebParam(name = "lastName") String userName,@WebParam(name = "email") String email,@WebParam(name = "roomNumber") String roomNumber) {
    	GuestInfo info = null;
    	Object obj = null;
    	try{
    		obj = guestInfoService.findGuestBillInfo(email, userName, roomNumber);
    		System.out.println("FIRST NAME IS: "+((GuestInfo) obj).getFirstName());
    		info = (GuestInfo) obj;
    		Collection c = info.getGuestStayInfos();
    		Iterator iter = c.iterator();
    		GuestStayInfo first = (GuestStayInfo) iter.next();
    		GuestTransactions [] gstArr = first.getGuestTransactionses().toArray(new GuestTransactions[0]);//(GuestTransactions[]) first.getGuestTransactionses().toArray();
    		for(int i=0;i<(gstArr.length-1);i++){
    			for(int j=i;j<gstArr.length;j++){
    				if(gstArr[i].getTransactionDate().after(gstArr[j].getTransactionDate())){
    					Calendar temp = gstArr[i].getTransactionDate();
    					gstArr[i].setTransactionDate(gstArr[j].getTransactionDate());
    					gstArr[j].setTransactionDate(temp);
    				}
    			}
    		}
    		Set<GuestTransactions> mySet = new HashSet<GuestTransactions>(Arrays.asList(gstArr));
    		first.setGuestTransactionses(mySet);
    		Set<GuestStayInfo> gsti = new HashSet<GuestStayInfo>();
    		gsti.add(first);
    		info.setGuestStayInfos(gsti);
    		obj = info;
    		/*Collections.sort(gst, new Comparator<Calendar>() {
    		    public int compare(Calendar o1, Calendar o2) {
    		    	return (o1.after(o2)?1:0);
    		        //return return (i1 > i2 ? -1 : (i1 == i2 ? 0 : 1));
    		    }
    		});*/
    		//info.setGuestStayInfos(guestStayInfos);
    	}catch(Exception e){
    		return returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.GETBILLINFO_DESCRIPTION, "getBillInfo");
    	}
    	if(Messages.CREDENTIALS_MESSAGE.equalsIgnoreCase(obj.toString())){
    		return returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.GETBILLINFO_DESCRIPTION, "getBillInfo");
    	}else{
            return obj;    		
    	}
    }
    
    @WebMethod(operationName = "guestCheckIn")
    public Object guestCheckIn(@WebParam(name = "guestInfo") GuestInfo guestInfo,@WebParam(name = "guestStayInfo") GuestStayInfo guestStayInfo) {
    	GuestInfo gi = null;
    	try{
    		gi = guestInfoService.saveGuestInfo(guestInfo);
    	}catch(Exception e){
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "guestCheckIn");
    	}
    	if(null == gi){
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "guestCheckIn");
    	}
    	GuestInfo guestInfo1 = null;
    	try{
    		guestInfo1 = guestInfoService.findGuestInfoByPrimaryKey(gi.getId());
    	}catch(Exception e){
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "guestCheckIn");
    	}
    	if(null == guestInfo1){
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "guestCheckIn");
    	}
    	guestStayInfo.setGuestInfo(guestInfo1);
    	try{
    		guestInfoStayService.saveGuestStayInfo(guestStayInfo);
    	}catch(Exception e){
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "guestCheckIn");
    	}
        return guestStayInfo;
    }
    
    @WebMethod(operationName = "reservationLookup")
    public Object reservationLookup(@WebParam(name = "reservationDetails") ReservationDetails resDetails) {
    	try{
	    	ReservationDetails gi = new ReservationDetails();
	    	String confirmationNumber = resDetails.getConfirmationNumber();
	    	String lastName = resDetails.getLastName();
	    	String creditCard = resDetails.getCreditCard();
	    	String loyaltyNumber = resDetails.getLoyaltyNumber();
	    	GuestInfo g = null;
	    	if(null != confirmationNumber && !"".equalsIgnoreCase(confirmationNumber.trim())){
	    		g = guestInfoService.findGuestInfoByConfirmationNumber(confirmationNumber);
	    	}else if(null != lastName && !"".equalsIgnoreCase(lastName.trim()) && null != creditCard && !"".equalsIgnoreCase(creditCard.trim())){
	    		g = guestInfoService.findGuestInfoByLastNameCreditCard(lastName,creditCard);
	    	}else if(null != loyaltyNumber && !"".equalsIgnoreCase(loyaltyNumber.trim())){
	    		g = guestInfoService.findGuestInfoByLoyaltyNumber(loyaltyNumber);
	    	}
			Collection c = g.getGuestStayInfos();
			Iterator iter = c.iterator();
			GuestStayInfo first = (GuestStayInfo) iter.next();
			gi.setGuestName(g.getFirstName()+" "+g.getLastName());
			gi.setRoomFeatures("WE DO NOT HAVE THIS FIELD YET.");
			gi.setTotalGuests(first.getNumberOfAdult()+first.getNumberOfChildren());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			String aDate="";
			String dDate = "";
			if (null != first.getArrivalDate()) {
				aDate = sdf.format(first.getArrivalDate().getTime());
			} 
			if (null != first.getDepartureDate()) {
				dDate = sdf.format(first.getDepartureDate().getTime());
			} 
			System.out.println(aDate+"ARRIVAL DATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
			System.out.println(dDate+"DEPARTURE DATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
			gi.setStayDates(aDate+"   -   "+dDate);
			gi.setLoyaltyNumber(g.getHhNumber());
			if(null != first.getTotalBill())
				gi.setTotalBill(first.getTotalBill().toString());
			gi.setSpecialRequests("WE DO NOT HAVE THIS FIELD YET.");
			if(null != first.getCardNumber() && !"".equalsIgnoreCase(first.getCardNumber().trim())){
				int len = first.getCardNumber().length();
				if(5 < len){
					gi.setCreditCard(first.getCardNumber().substring(first.getCardNumber().length()-4));
				}else{
					gi.setCreditCard(first.getCardNumber());
				}
			}
	    	return gi;
    	}catch(NullPointerException e){
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "reservationLookup");
    	}catch(Exception e){
    		return returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.RESERVATION_REASON, Messages.RESERVATION_DESCRIPTION, "reservationLookup");
    	}
    }
    
    @WebMethod(operationName = "placeOrder")
    public Object[] placeOrder(@WebParam(name = "lastName") String lastName,@WebParam(name = "email") String email,@WebParam(name = "roomNumber") String roomNumber,@WebParam(name = "guestTransactions") GuestTransactions[] guestTransactions) {
    	GuestInfo gi = null;
    	try{
    		gi = guestInfoService.findGuestByEmailLastNameRoom(lastName,email,roomNumber);
    	}catch(Exception e){
    		Object [] obj = new Object[1];
    		obj[0] = returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.GETBILLINFO_DESCRIPTION, "placeOrder");
    		return obj;
    	}
    	if(null == gi){
    		Object [] obj = new Object[1];
    		obj[0] = returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.GETBILLINFO_DESCRIPTION, "placeOrder");
    		return obj;
    	}
    	try{
	    	for(GuestTransactions gT:guestTransactions){
	    		Collection c = gi.getGuestStayInfos();
	    		Iterator iter = c.iterator();
	    		GuestStayInfo first = (GuestStayInfo) iter.next();
	    		gT.setGuestStayInfo(first);
	    		guestTransactionsService.saveGuestTransactions(gT);
	    	}
    	}catch(Exception e){
    		Object [] obj = new Object[1];
    		obj[0] = returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "placeOrder");
    		return obj;
    	}
    	return guestTransactions;
    }
    
    @WebMethod(operationName = "guestCheckout")
    public Object[] guestCheckout(@WebParam(name = "lastName") String userName,@WebParam(name = "email") String email,@WebParam(name = "creditCardNumber") String creditCardNumber,@WebParam(name = "roomNumber") String roomNumber) {
    	GuestInfo gi = null;
    	GuestTransactions [] gt = null;
    	try{
    		gi = guestInfoService.findGuestByEmailLastNameRoom(userName, email, roomNumber);
    		Collection c = gi.getGuestStayInfos();
    		Iterator iter = c.iterator();
    		GuestStayInfo gsf = (GuestStayInfo) iter.next();
    		if(null != gi && null != gsf && gsf.getCheckedOut() != null && gsf.getCheckedOut() == true){
    			Object [] obj = new Object[1];
        		obj[0] = returnFaultObject("Guest can not be checked out","You can not be check out right now.", "Can not be checked out either because you are already checked out or no information found for given credentials.", "Please check if you are already checked out or the provided information is correct.", "guestCheckoutFALSE");
        		return obj;
    		}
    	}catch(Exception e){
    		Object [] obj = new Object[1];
    		obj[0] = returnFaultObject(Messages.FAULT_CODE_CREDENTIALS,Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.CHECKOUT_DESCRIPTION, "guestCheckout");
    		return obj;
    	}
    	if(null != gi){
    		try{
	    		GuestStayInfo gsi = null;
	    		Collection c = gi.getGuestStayInfos();
	    		Iterator iter = c.iterator();
	    		gsi = (GuestStayInfo) iter.next();
	    		gt = new GuestTransactions[gsi.getGuestTransactionses().size()];
	    		int index = 0;
	    		for(GuestTransactions gT:gsi.getGuestTransactionses()){
	    			gt[index] = gT;
	    			index++;
	        	}
	    		if(null != gsi){
	    			//Set credit Card number if provided is not null or empty.
	    			if(null != creditCardNumber && !"".equalsIgnoreCase(creditCardNumber)){
	    				gsi.setCardNumber(creditCardNumber);
	    			}
	    			//Set credit amount equal to total bill
	    			gsi.setCreditAmount(gsi.getTotalBill());
	    			//Set balance amount to 0
	    			BigDecimal bgd = new BigDecimal(0);
	    			gsi.setBalanceAmount(bgd);
	    			//Set departure date and time to now.
	    			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    			Date today = Calendar.getInstance().getTime(); 
	    			Calendar cal = Calendar.getInstance();
	    			cal.setTime(today);
	    			gsi.setDepartureDate(cal);
	    			//Set checked out
	    			gsi.setCheckedOut(true);
	    		}
	        	gi = guestInfoService.saveGuestInfo(gi);
	        	System.out.println("DATE IS: ++++++++++++ " +gsi.getDepartureDate());
	        	guestInfoStayService.saveGuestStayInfo(gsi);
    		}catch(Exception e){
    			Object [] obj = new Object[1];
        		obj[0] = returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "guestCheckout");
        		return obj;
    		}
    	}else{
    		Object [] obj = new Object[1];
    		obj[0] = returnFaultObject(Messages.FAULT_CODE_CREDENTIALS,Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.CHECKOUT_DESCRIPTION, "guestCheckout");
    		return obj;
    	}
		for(int i=0;i<(gt.length-1);i++){
			for(int j=i;j<gt.length;j++){
				if(gt[i].getTransactionDate().after(gt[j].getTransactionDate())){
					Calendar temp = gt[i].getTransactionDate();
					gt[i].setTransactionDate(gt[j].getTransactionDate());
					gt[j].setTransactionDate(temp);
				}
			}
		}
        return gt;
    }
    
    private String returnFaultObject(String code, String message, String reason, String description, String service){
    	String msg = "<soap:Fault xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'"; 
    		   msg += "xmlns='' >";
    		   msg += "<faultcode>"+code+"</faultcode>";
    		   msg += "<faultstring>"+message+"</faultstring>";
    		   msg += "<faultreason>"+reason+"</faultreason>";
    		   msg += "<detail>";
    		   msg += description;
    		   msg += "</detail>";
    		   msg += "<service>"+service+"</service>";
    		   msg += "</soap:Fault>";
    	System.out.println(msg);
    	return msg;
    }
    
}
