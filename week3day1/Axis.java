package week3day1;

public class Axis extends BankInfo {
	public void deposit()
	{
		System.out.println("deposit");
	}
	
	
public static void main(String args[])
{
	BankInfo bank=new BankInfo();
	//super.deposit();
	
	bank.deposit();
	bank.saving();
	bank.fixed();
	
}
}
