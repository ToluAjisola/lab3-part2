package Lab1;
public class BuddyInfo {
	private String phone ;
	private String name ;
	private String address ;

	//public static BuddyInfo one;
	public BuddyInfo(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		
	}
	
	public static void main(String[] args) {
		/*one = new BuddyInfo();
		
		one.setName("Matt");
		one.setPhone("6788");
		one.setAddress("1233 colonel by drive");
		System.out.println("Hello "+ one.getName() );*/

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone1) {
		this.phone = phone1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		
		name = name1;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address1) {
		this.address = address1;
	}

}
