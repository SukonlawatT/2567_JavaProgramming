package txtFile;

public class ATMData {
	private String accountNumber;
	private String password;
	 
	ATMData(String accountNumber,String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	String getID() {
		return this.accountNumber;
	}
	String getPass() {
		return this.password;
	}

}
