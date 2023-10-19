package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Banco;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.println("HELLO!");
		System.out.println();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?" );
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valueInitial = sc.nextDouble();
			 banco = new Banco( number, holder, valueInitial);
		}
		else {
			banco = new Banco(number , holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("enter a deposit value: ");
		double depositValue = sc.nextDouble();
		banco.deposit(depositValue);
		System.out.println("Upadate account data:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		banco.Saque(withdrawValue);
		System.out.println("Upadate account data:");
		System.out.println(banco);
		
		
		
		sc.close();
	}
}
