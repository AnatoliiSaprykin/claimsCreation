package claimsCreationAuto;

//it is internal part of JSON

public class VehicleClaimAssignment {
	public AutoInformation autoInformation;

	  public AutoInformation getAutoInformation() { return this.autoInformation; }

	  public void setAutoInformation(AutoInformation autoInformation) { this.autoInformation = autoInformation; }

	  public String customerName;

	  public String getCustomerName() { return this.customerName; }

	  public void setCustomerName(String customerName) { this.customerName = customerName; }

	  public String assignmentTypeId;

	  public String getAssignmentTypeId() { return this.assignmentTypeId; }

	  public void setAssignmentTypeId(String assignmentTypeId) { this.assignmentTypeId = assignmentTypeId; }

	  public String policyNumber;

	  public String getPolicyNumber() { return this.policyNumber; }

	  public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

	  public String insuredName;

	  public String getInsuredName() { return this.insuredName; }

	  public void setInsuredName(String insuredName) { this.insuredName = insuredName; }

	  public String insuredPhone;

	  public String getInsuredPhone() { return this.insuredPhone; }

	  public void setInsuredPhone(String insuredPhone) { this.insuredPhone = insuredPhone; }

	  public String insuredSecondaryPhone;

	  public String getInsuredSecondaryPhone() { return this.insuredSecondaryPhone; }

	  public void setInsuredSecondaryPhone(String insuredSecondaryPhone) { this.insuredSecondaryPhone = insuredSecondaryPhone; }

	  public String customerNotes;

	  public String getCustomerNotes() { return this.customerNotes; }

	  public void setCustomerNotes(String customerNotes) { this.customerNotes = customerNotes; }

	  public String address;

	  public String getAddress() { return this.address; }

	  public void setAddress(String address) { this.address = address; }

	  public String city;

	  public String getCity() { return this.city; }

	  public void setCity(String city) { this.city = city; }

	  public String state;

	  public String getState() { return this.state; }

	  public void setState(String state) { this.state = state; }

	  public String zipCode;

	  public String getZipCode() { return this.zipCode; }

	  public void setZipCode(String zipCode) { this.zipCode = zipCode; }
	  
	  
	  public static VehicleClaimAssignment getEmpty() {
		
		  VehicleClaimAssignment vca = new VehicleClaimAssignment();
		  vca.setCustomerName("AllstateAutoClaims");
		  vca.setAssignmentTypeId("VehicleClaimAssist");
		  vca.setPolicyNumber("53067700");
		  vca.setInsuredName("Vova test");
		  vca.setInsuredPhone("38-068-505-0219");
		  vca.setInsuredSecondaryPhone("123456789");
		  vca.setCustomerNotes("customerNotes");
		  
		  
		  AutoInformation ai = new AutoInformation();
		  ai.setColor("black");
		  ai.setMake("Kia");
		  ai.setModel("Sportage");
		  ai.setMakeModel("Kia Sportage");
		  
		  ai.setVin("4444567890123452222");
		  ai.setYear("2017");
		  
		  vca.setAutoInformation(ai);
		  return vca;
		  
		  
	  }

}
