package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Holder;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Holder holder;

		double value = 0;

		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accName = sc.nextLine();
		System.out.print("Is there a initial deposit? (y/n) ");
		char opt = sc.next().charAt(0);
		if (opt == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			holder = new Holder(accNumber, accName, initialValue);
		}
		else {
			holder = new Holder(accNumber, accName);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(holder);

		System.out.println();
		System.out.print("Enter Deposit value: ");
		value = sc.nextDouble();
		holder.deposit(value);
		System.out.println();
		System.out.println("Updated Account data: ");
		System.out.println(holder);

		System.out.println();
		System.out.print("Enter Withdraw value: ");
		value = sc.nextDouble();
		holder.withdraw(value);
		System.out.println();
		System.out.println("Updated Account data: ");
		System.out.println(holder);

		sc.close();
	}
}
