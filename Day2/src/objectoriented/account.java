package objectoriented;

public class account {
	private String number;
	private double balance;
	private String name;
	private String email;
	private String phno;
	private customeraddress caddress;
	
	
	
	
	public account(String number, double balance, String name, String email, String phno) {
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phno = phno;
	}
	public account(String number,String name) {
		this.number=number;
		this.name=name;
	}


	@Override
	public String toString() {
		return "account [number=" + number + ", balance=" + balance + ", name=" + name + ", email=" + email + ", phno="
				+ phno + "]";
	}
	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhno() {
		return phno;
	}


	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
	class customeraddress{
		String buildingno;
		String street;
		
		public String getBuildingno() {
			return buildingno;
		}
		public void setBuildingno(String buildingno) {
			this.buildingno = buildingno;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		String city;
		String state;
		
	}

}
