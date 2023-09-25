package in.ineuron;

public class BankAccount {

	private static long balance;

	//Depositing Money in bankAccount
	public String depositMoney(int deposit) {
		balance += deposit;
		
		return deposit+" Amount has been Deposited in your Account Succesfully";
	}
	
	//Withdrawing Money from bank Account
	public String withdrawMoney(int withdrawAmt) {
		
		balance-=withdrawAmt;
		return withdrawAmt+" Amount has been withdrawn from your Account Succesfully";
	}
	
	public void checkBalance() {
		System.out.println("Your Account Balance is  => "+balance);
	}
}
