package day1.polymorphism;

public class CustomerDetails {
	private String customerName;
	private long phoneNumber;
	 private String address;
	 
	 public String getCustomerName()
	 {
		 return this.customerName;
	 }
	 
	 public long getPhoneNumber()
	 {
		 return this.phoneNumber;
	 }
	 
	 public String getAddress()
	 {
		 return this.address;
	 }
	 
	 public void setCustomerName(String customerName) 
	 {
		 this.customerName = customerName;
	 }
	 
	 public void setPhoneNumber(long phoneNumber)
	 {
		 this.phoneNumber = phoneNumber;
	 }
	 
	 public void setAddress(String address)
	 {
		 this.address = address;
	 }
	 
	 public CustomerDetails(String customerName, long phoneNumber, String address)
	 {
		 this.customerName = customerName;
		 this.phoneNumber = phoneNumber;
		 this.address = address;
	 }
	 
	 
	 
}
