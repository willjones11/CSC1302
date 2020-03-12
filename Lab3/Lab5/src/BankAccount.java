
public class BankAccount {
	double balance;
	String name;
	
	BankAccount( String name, double balance) {
		this.name = name; 
		this.balance = balance;
	}
	public  void deposit(double amount) {
		balance += amount;
		
	}
	public void withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
		}
		else {
			System.out.print("Not Enough to Withdraw\n");
			
		}
		
	}
	public void displayBalance() {
		System.out.print(name + " , $" + balance);
	}
	public static void main(String[] args) {
		BankAccount B1 = new BankAccount("John", 1000);
		B1.deposit(500);
		B1.displayBalance();
		System.out.println();
		B1.withdraw(300);
		B1.displayBalance();
		System.out.println();
		BankAccount B2 = new BankAccount("William", 44343.33);
		B2.displayBalance();
		
	}
}
