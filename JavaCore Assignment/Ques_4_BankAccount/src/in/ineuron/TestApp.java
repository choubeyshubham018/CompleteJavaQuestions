package in.ineuron;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
       BankingFacility();
	}

	public static void BankingFacility() {
		Scanner sc = new Scanner(System.in);
		BankAccount bnk = new BankAccount();
		while (true) {
			System.out.println("1.Deposit Money        ----->  press 1");
			System.out.println("2.Withdraw Money       ----->  press 2");
			System.out.println("3.Check Balance        ----->  press 3");
			System.out.println("4.Exit                 ----->  press 4");

			System.out.println("Kindly Enter your Choice below  --");
			int resp = sc.nextInt();

			switch (resp) {
			case 1: {
				System.out.println("Enter the Amount you want the deposit -- ");
				int amt = sc.nextInt();
				if (amt > 0) {
					String res = bnk.depositMoney(amt);
					System.out.println(res);
					System.out.println("Press 1 to go back to Main Menu");
					System.out.println("Press any key to Exit");
					int choice = sc.nextInt();
					if (choice == 1) {
						BankingFacility();
					} else {
						System.out.println("Thank you");
						System.exit(1);
					}
				} else {
					System.out.println("Invalid Input Try again");
					BankingFacility();
				}

				break;
			}
			case 2: {
				System.out.println("Enter the Amount you want to Withdraw");
				int amt = sc.nextInt();
				if (amt < 0) {
					amt = amt * -1;
				}
				String res = bnk.withdrawMoney(amt);
				System.out.println(res);
				System.out.println("Press 1 to go back to Main Menu");
				System.out.println("Press any key to Exit");
				int choice = sc.nextInt();
				if (choice == 1) {
					BankingFacility();
				} else {
					System.out.println("Thank you");
					System.exit(1);
				}

				break;
			}
			case 3: {
				bnk.checkBalance();
				System.out.println("Press 1 to go back to Main Menu");
				System.out.println("Press any key to Exit");
				int choice = sc.nextInt();
				if (choice == 1) {
					BankingFacility();
				} else {
					System.out.println("Thank you");
					System.exit(1);
				}
				break;
			}
			case 4: {
				System.out.println("Thank you");
				System.exit(1);
				break;
			}
			default:
              System.out.println("Invalid Input, Try Again with Valid Choice");
              BankingFacility();
			}
		}

	}

}
