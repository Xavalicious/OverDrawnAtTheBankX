
public class BankAccount {
	
	private double balance;
	private String name;
	
	public BankAccount(double b, String n){
	balance=b;
	name=n;
	}

	public void deposit(double deposit){
	balance=balance+deposit;
	}
	public void withdraw(double withdraw){
	balance=balance-withdraw;	
	}
	public double seebalance(){
	return balance;
	}
	
}
