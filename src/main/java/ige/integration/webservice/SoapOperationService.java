package ige.integration.webservice;


import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;
import ige.integration.domain.HotelFolio;
import ige.integration.domain.ReportProblem;
import ige.integration.domain.ReservationDetails;
import ige.integration.messages.Messages;
import ige.integration.service.GuestInfoService;
import ige.integration.service.GuestStayInfoService;
import ige.integration.service.GuestTransactionsService;
import ige.integration.service.ReportProblemService;

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
    
    @Autowired
	private ReportProblemService reportProblemService;

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
    public ReservationDetails reservationLookup(@WebParam(name = "reservationDetails") ReservationDetails resDetails) {
    	ReservationDetails gi = new ReservationDetails();
    	try{
	    	String confirmationNumber = resDetails.getConfirmationNumber();
	    	String lastName = resDetails.getLastName();
	    	String creditCard = resDetails.getMaskedCardNumber();
	    	String roomNumber = resDetails.getRoomNumber();
	    	System.out.println("ROOM NUMBER IS: "+roomNumber);
	    	String loyaltyNumber = resDetails.getLoyaltyCardNumber();
	    	Object g = null;
	    	if(null != confirmationNumber && !"".equalsIgnoreCase(confirmationNumber.trim())){
	    		g = guestInfoService.findGuestInfoByConfirmationNumber(confirmationNumber);
	    		if(null == g || g.toString().contains("ERROR")){
	    			gi.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Confirmation Number not found.", "reservationLookup"));
	    			return gi;
	    		}
	    	}else if(null != lastName && !"".equalsIgnoreCase(lastName.trim()) && null != creditCard && !"".equalsIgnoreCase(creditCard.trim())){
	    		int length = creditCard.length();
	    		String cc = creditCard.substring(length-4);
	    		g = guestInfoService.findGuestInfoByLastNameCreditCard(lastName,cc);
	    		if(null == g || g.toString().contains("ERROR")){
	    			gi.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Last Name and Masked Number did not match.", "reservationLookup"));
	    			return gi;
	    		}
	    	}else if(null != lastName && !"".equalsIgnoreCase(lastName.trim()) && null != roomNumber && !"".equalsIgnoreCase(roomNumber.trim())){
	    		System.out.println("ROOOOOOOM");
	    		g = guestInfoService.findGuestInfoByLastNameRoom(lastName,roomNumber);
	    		if(null == g || g.toString().contains("ERROR")){
	    			gi.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Last Name and Room Number did not match.", "reservationLookup"));
	    			return gi;
	    		}
	    	}else if(null != loyaltyNumber && !"".equalsIgnoreCase(loyaltyNumber.trim())){
	    		g = guestInfoService.findGuestInfoByLoyaltyNumber(loyaltyNumber);
	    		if(null == g || g.toString().contains("ERROR")){
	    			gi.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Loyalty Number not found.", "reservationLookup"));
	    			return gi;
	    		}
	    	}
			Collection c = ((GuestInfo) g).getGuestStayInfos();
			Iterator iter = c.iterator();
			GuestStayInfo first = (GuestStayInfo) iter.next();
			gi.setNamePrefix(((GuestInfo) g).getNamePrefix());
			if(null == gi.getNamePrefix() || "".equalsIgnoreCase(gi.getNamePrefix()))
				gi.setNamePrefix("   ");
			gi.setFirstName(((GuestInfo) g).getFirstName());
			if(null == gi.getFirstName() || "".equalsIgnoreCase(gi.getFirstName()))
				gi.setFirstName("   ");
			gi.setLastName(((GuestInfo) g).getLastName());
			if(null == gi.getLastName() || "".equalsIgnoreCase(gi.getLastName()))
				gi.setLastName("   ");
			gi.setRoomFeatures(first.getRoomFeatures());
			if(null == gi.getRoomFeatures() || "".equalsIgnoreCase(gi.getRoomFeatures()))
				gi.setRoomFeatures("   ");
			String card = first.getCardNumber();
			if(null != card && !"".equalsIgnoreCase(card.trim())){
				if(4 < card.length()){
					card = "XXXXXXXXXXXX"+card.substring(card.length()-4);
				}else{
					card = "XXXXXXXXXXXX"+card;
				}
			}
			gi.setMaskedCardNumber(card);
			if(null == gi.getMaskedCardNumber() || "".equalsIgnoreCase(gi.getMaskedCardNumber()))
				gi.setMaskedCardNumber("   ");
			gi.setCurrencyCode(first.getCurrencyCode());
			if(null == gi.getCurrencyCode() || "".equalsIgnoreCase(gi.getCurrencyCode()))
				gi.setCurrencyCode("   ");
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
			if(null == gi.getStayDates() || "".equalsIgnoreCase(gi.getStayDates()))
				gi.setStayDates("   ");
			gi.setLoyaltyCardNumber(((GuestInfo) g).getLoyaltyNumber());
			if(null == gi.getLoyaltyCardNumber() || "".equalsIgnoreCase(gi.getLoyaltyCardNumber()))
				gi.setLoyaltyCardNumber("   ");
			if(null != first.getTotalBill())
				gi.setTotalForStay(first.getTotalBill().toString());
			if(null == gi.getTotalForStay() || "".equalsIgnoreCase(gi.getTotalForStay()))
				gi.setTotalForStay("0.0");
			gi.setSpecialRequests(first.getSpecialRequest());
			if(null == gi.getSpecialRequests() || "".equalsIgnoreCase(gi.getSpecialRequests()))
				gi.setSpecialRequests("   ");
			if(null != confirmationNumber){
				gi.setConfirmationNumber(confirmationNumber);
			}
			if(null == gi.getConfirmationNumber() || "".equalsIgnoreCase(gi.getConfirmationNumber()))
				gi.setConfirmationNumber("   ");
			if(null != first.getCardNumber() && !"".equalsIgnoreCase(first.getCardNumber().trim())){
				int len = first.getCardNumber().length();
				if(5 < len){
					gi.setMaskedCardNumber(first.getCardNumber().substring(first.getCardNumber().length()-4));
				}else{
					gi.setMaskedCardNumber(first.getCardNumber());
				}
			}
    	}catch(NullPointerException e){
    		e.printStackTrace();
    		gi.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "reservationLookup"));
    	}catch(Exception e){
    		e.printStackTrace();
    		gi.setError(returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.RESERVATION_REASON, Messages.RESERVATION_DESCRIPTION, "reservationLookup"));
    	}
    	return gi;
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
    
    
    @WebMethod(operationName = "HotelFolio")
    public HotelFolio HotelFolio(@WebParam(name = "terminalId") String terminalId,@WebParam(name = "reservationNumber") String reservationNumber,@WebParam(name = "folioType") String folioType) {
    	HotelFolio hotelFolio = new HotelFolio();
    	GuestStayInfo gi = null;
		try{
			System.out.println("RESERVATION NUMBER IS: "+reservationNumber);
			Object obj = guestInfoService.findGuestByReservationNumber(reservationNumber);
			if(null == obj || obj.toString().contains("ERROR")){
				hotelFolio.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Reservation Number not found.", "reservationLookup"));
    			return hotelFolio;
			}
			gi = (GuestStayInfo) obj;
			System.out.println("GOT THE RESULT");
			if(null == gi){
				System.out.println("NULLLLLLLLLLLLLLLLLLLL");
			}
		}catch(NullPointerException e1){
			System.out.println("EXCEPTION 1");
			hotelFolio.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "HotelFolio"));
			return hotelFolio;
		}catch(IllegalArgumentException e2){
			System.out.println("EXCEPTION 2");
			hotelFolio.setError(returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.FOLIO_REASON, Messages.FOLIO_DESCRIPTION, "HotelFolio"));
			return hotelFolio;
		}catch(Exception e5){
			System.out.println("EXCEPTION 3");
			hotelFolio.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "HotelFolio"));
			return hotelFolio;
		}
		if(null != gi){
			System.out.println("NOT NULLLLLLLLLLLLLLLLLLLL and folio is: "+gi.getFolioNumber()+" and ID is: "+gi.getGuestInfo().getId());
			GuestInfo g = guestInfoService.findGuestInfoByPrimaryKey(gi.getGuestInfo().getId());
			if(null != g){
				hotelFolio.setFolioType(folioType);
				hotelFolio.setTerminalId(terminalId);
	    		hotelFolio.setFolioId(gi.getId().toString());
	    		hotelFolio.setReservationNumber(reservationNumber);
	    		hotelFolio.setFolioContent("FirstName: "+g.getFirstName()+", LastName: "+g.getLastName()+", Email: "+g.getEmail());
			}else{
				hotelFolio.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "HotelFolio"));
				return hotelFolio;
			}
		}
		System.out.println("BEFORE RETURN STATEMENT");
    	return hotelFolio;
    }
    
    @WebMethod(operationName = "paymentCardProcessing")
    public String[] paymentCardProcessing(@WebParam(name = "terminalId") String terminalId,@WebParam(name = "confirmationNumber") String confirmationNumber,@WebParam(name = "processType") String processType,@WebParam(name = "paymentType") String paymentType,@WebParam(name = "cardType") String cardType,@WebParam(name = "cardHolderName") String cardHolderName,@WebParam(name = "cardNumber") String cardNumber,@WebParam(name = "creditCardExpirationDate") String creditCardExpirationDate) {
    	String [] response = new String[2];
    	
    	return response;
    }
    
    @WebMethod(operationName = "reportProblem")
    public String reportProblem(@WebParam(name = "lastName") String lastName,@WebParam(name = "confirmationNumber") String confirmationNumber,@WebParam(name = "roomNumber") String roomNumber,@WebParam(name = "problemID") String problemID,@WebParam(name = "problemMessage") String problemMessage) {
    	try{
    		System.out.println("1");
	    	ReportProblem rp = new ReportProblem(lastName,confirmationNumber,roomNumber,problemID,problemMessage);
	    	System.out.println("2");
	    	ReportProblem temp = reportProblemService.saveReportProblem(rp);
	    	if(null != temp && null != temp.getId()){
	    		System.out.println("4");
	    		return "<status>success</status>";
	    	}
    	}catch(Exception e){
    		e.printStackTrace();
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Can not report the problem right now, please try later!", "reportProblem");
    	}
    	return "<status>failure</status>";
    }
    
    @WebMethod(operationName = "getGuestStayInfo")
    public Object getGuestStayInfo(@WebParam(name = "lastName") String lastName,@WebParam(name = "email") String email,@WebParam(name = "roomNumber") String roomNumber) {
    	GuestInfo gi = null;
    	try{
    		gi = guestInfoService.findGuestByEmailLastNameRoom(lastName, email, roomNumber);
    		Collection c = gi.getGuestStayInfos();
    		Iterator iter = c.iterator();
    		return (GuestStayInfo) iter.next();
    	}catch(Exception e){
    		e.printStackTrace();
    		return returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Can not find guest stay information against given lastName, email and roomNumber!", "getGuestStayInfo");
    	}
    }
    
    @WebMethod(operationName = "guestSignature")
    public String guestSignature(@WebParam(name = "terminalId") String terminalId, @WebParam(name = "confirmationNumber") String confirmationNumber,@WebParam(name = "signatureFile") String signatureFile) {
    	try{
	    	byte[] sig = signatureFile.getBytes();
	    	GuestInfo gi = (GuestInfo) guestInfoService.findGuestInfoByConfirmationNumber(confirmationNumber);
	    	if(null != gi){
	    		gi.setSignature(sig);
	    		guestInfoService.saveGuestInfo(gi);
	    		return "<terminalId>"+terminalId+"</terminalId><confirmationNumber>"+confirmationNumber+"</confirmationNumber><status>"+"success"+"</status>";
	    	}
    	}catch(Exception e){
    		return "<terminalId>"+terminalId+"</terminalId><confirmationNumber>"+confirmationNumber+"</confirmationNumber><status>"+"failure"+"</status>";
    	}
    	return "<terminalId>"+terminalId+"</terminalId><confirmationNumber>"+confirmationNumber+"</confirmationNumber><status>"+"failure"+"</status>";
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
