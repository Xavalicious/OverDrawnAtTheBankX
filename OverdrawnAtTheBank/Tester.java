
public class Tester {

	public static void main(String[] args) {
		BankAccount myAccount=new BankAccount(1000.00, "Xav");
		myAccount.deposit(505.22);
		System.out.println(myAccount.seebalance());
		myAccount.withdraw(100.00);
		System.out.println("The Xav account balance is, $1,405.22");
	}

}
