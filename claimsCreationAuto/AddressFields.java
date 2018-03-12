package claimsCreationAuto;


import java.util.ArrayList;

public class AddressFields {
	
	public String insuredName;
	public AddressFields(String insuredName, String address, String city, String state, String zipCode) {
		super();
		this.insuredName = insuredName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}



	public AddressFields() {
		// TODO Auto-generated constructor stub
	}



	public String address;

	 

	public String city;

	  

	public String state;

	 

	public String zipCode;

}
