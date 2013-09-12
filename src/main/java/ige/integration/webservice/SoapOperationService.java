package ige.integration.webservice;


import ige.integration.domain.GuestInfo;
import ige.integration.service.GuestInfoService;
import ige.integration.service.GuestInfoServiceImpl;

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

    @WebMethod(operationName = "sayHello")
    public String sayHelloToTheUser(@WebParam(name = "name") String userName) {
        return HELLO + " " + userName;
    }
    
    @WebMethod(operationName = "getBillInfo")
    public GuestInfo getGuestInfo(@WebParam(name = "lastName") String userName,@WebParam(name = "email") String email,@WebParam(name = "roomNumber") String roomNumber) {
    	GuestInfo info = new GuestInfo();
    	info = guestInfoService.findGuestBillInfo(email, userName, roomNumber);    	
        return info;
    }
}
