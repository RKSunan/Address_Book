package AdressBook;

public class Person {
	String name;
	String phnno;
	String city;
	String pincode;
	
	
	  Person(String name, String phnno, String city, String pincode) {
	        this.name = name;
	        this.phnno = phnno;
	        this.city = city;
	        this.pincode = pincode;
	  }
	
	public String getName() {
		return name;
	}
	public String getPhnno() {
		return phnno;
	}
	public String getCity() {
		return city;
	}
	public String getPincode() {
		return pincode;
	}
	public String toString() {
        return "\n\nName: " + getName() +  "\nPhone number: " + getPhnno() + "\nCity: " +
                getCity() + "\nPincode: " + getPincode();
    }
}




