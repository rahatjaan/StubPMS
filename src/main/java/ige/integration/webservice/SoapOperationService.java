package ige.integration.webservice;


import ige.integration.domain.GuestInfo;
import ige.integration.domain.GuestStayInfo;
import ige.integration.domain.GuestTransactions;
import ige.integration.service.GuestInfoService;
import ige.integration.service.GuestStayInfoService;
import ige.integration.service.GuestTransactionsService;

import java.util.Collection;
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
    
}
