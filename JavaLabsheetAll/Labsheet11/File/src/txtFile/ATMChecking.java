package txtFile;
import java.util.*;
import java.io.*;
public class ATMChecking extends ATMData{
	private int money;
	
	ATMChecking(String accountNumber,String password,int money) {
		super(accountNumber,password);
		this.money = money;
	}
	boolean checkBookBank() throws IOException{
		try(BufferedReader readFile = new BufferedReader (new FileReader("src//txtFile//ATMBookBank.txt"))) {
			String temp = "";
			while((temp = readFile.readLine())!=null) {
				String[] data = temp.split("\t");
				if(data.length<3) continue;
				
				if(data[0].equals(getID()) && data[1].equals(getPass())) {
					int balance = Integer.parseInt(data[2]);
					return money <= balance && money %100 == 0;
				}
				
				
			}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
/*ATMBookBank.txt*/