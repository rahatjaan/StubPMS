package ige.integration.webservice;

import ige.integration.domain.GuestInfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class UserOperationService {
    private static final String HELLO = "Hello";

    @WebMethod(operationName = "sayHello")
    public String sayHelloToTheUser(@WebParam(name = "name") String userName) {
        return HELLO + " " + userName;
    }
    
    @WebMethod(operationName = "getUser")
    public GuestInfo getGuestInfo(@WebParam(name = "lastName") String userName,@WebParam(name = "email") String email) {
    	GuestInfo info = new GuestInfo();
    	info.setFirstName("Rahat");
    	info.setLastName("Ali");
    	info.setConfirmationNumber("Some number");
    	info.setFullAddress("Address");
    	
        return info;
    }
}
