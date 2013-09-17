package ige.integration.messages;

public class Messages {
	
	//***Fault Codes ***
	public static final String FAULT_CODE_DATABASE = "1";
	public static final String FAULT_CODE_CREDENTIALS = "2";
	//******************
	
	public static final String DATABASE_MESSAGE = "Database transaction issue.";
	public static final String CREDENTIALS_MESSAGE = "Input parameters are either incorrect or don't match.";
	public static final String CREDENTIALS_REASON = "Please verify if the number of input parameters are right and parameters are case-sensitive.";
	public static final String GETBILLINFO_DESCRIPTION = "Following parameters are required: lastName,email,roomNumber   !!!Remember parameter names are case-sensitive!!!";
	public static final String DATABASE_REASON = "Either provided credentials are not found in the database, please retry or contact Administrator.";
	public static final String DATABASE_DESCRIPTION = "The information you are trying to save in the database is not saved properly. Kindly verify the input parameters.";
	public static final String CHECKOUT_DESCRIPTION = "Following parameters are required: lastName,email,creditCardNumber   !!!Remember parameter names are case-sensitive!!!";
}
