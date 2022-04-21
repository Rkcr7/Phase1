package objectoriented;

public class Constructor {
	public static void main(String[] args) {
		account ritik = new account("123456",15000,"Ritik","ritikrkcr7@gmail.com","9991448771");
		System.out.println("Customer name: "+ritik.getName());
		System.out.println("Account balance:"+ritik.getBalance());
		

		account ramu=new account("9991448771","Ramu");
		System.out.println(ramu);
		
		account.customeraddress caddress= ritik.new customeraddress();
		caddress.setBuildingno("486");
		System.out.println(ritik);
		
		
	}

}
