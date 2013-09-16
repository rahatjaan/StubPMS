package ige.integration.webservice;


import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;
import ige.integration.service.GuestInfoService;
import ige.integration.service.GuestStayInfoService;
import ige.integration.service.GuestTransactionsService;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

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
    public GuestInfo getBillInfo(@WebParam(name = "lastName") String userName,@WebParam(name = "email") String email,@WebParam(name = "roomNumber") String roomNumber) {
    	GuestInfo info = new GuestInfo();
    	info = guestInfoService.findGuestBillInfo(email, userName, roomNumber);    	
        return info;
    }
    
    @WebMethod(operationName = "guestCheckIn")
    public GuestStayInfo guestCheckIn(@WebParam(name = "guestInfo") GuestInfo guestInfo,@WebParam(name = "guestStayInfo") GuestStayInfo guestStayInfo) {
    	GuestInfo gi = new GuestInfo();
    	gi = guestInfoService.saveGuestInfo(guestInfo);
    	GuestInfo guestInfo1 = guestInfoService.findGuestInfoByPrimaryKey(gi.getId());
    	guestStayInfo.setGuestInfo(guestInfo1);
    	guestInfoStayService.saveGuestStayInfo(guestStayInfo);
        return guestStayInfo;
    }
    
    @WebMethod(operationName = "placeOrder")
    public GuestTransactions[] placeOrder(@WebParam(name = "lastName") String lastName,@WebParam(name = "email") String email,@WebParam(name = "roomNumber") String roomNumber,@WebParam(name = "guestTransactions") GuestTransactions[] guestTransactions) {
    	GuestInfo gi = new GuestInfo();
    	gi = guestInfoService.findGuestByEmailLastNameRoom(lastName,email,roomNumber);
    	for(GuestTransactions gT:guestTransactions){
    		Collection c = gi.getGuestStayInfos();
    		Iterator iter = c.iterator();
    		GuestStayInfo first = (GuestStayInfo) iter.next();
    		gT.setGuestStayInfo(first);
    		guestTransactionsService.saveGuestTransactions(gT);
    	}
    	return guestTransactions;
    }
    
    @WebMethod(operationName = "guestCheckout")
    public GuestInfo guestCheckout(@WebParam(name = "lastName") String userName,@WebParam(name = "email") String email,@WebParam(name = "creditCardNumber") String creditCardNumber) {
    	GuestInfo gi = new GuestInfo();
    	gi = guestInfoService.findGuestByEmail(email);
    	if(null != gi){
    		GuestStayInfo gsi = null;
    		Collection c = gi.getGuestStayInfos();
    		Iterator iter = c.iterator();
    		gsi = (GuestStayInfo) iter.next();
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
    	}
        return gi;
    }
    
}
