package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Conta_Bancaria;

public class Main {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta_Bancaria x = new Conta_Bancaria();
		
		   System.out.println("BEM VINDO!");
		   System.out.println("faça sua escolha:" );
		   System.out.println("1 = DEPOSITAR");
		   System.out.println("2 = SACAR ");
		   System.out.println("3 = SAIR");
		   System.out.print("ESCOLHA: ");
	        x.escolher1 = sc.nextInt();

	        while (x.escolher1 != 3) {
	        	if (x.escolher1 == 1) {
	        		System.out.print("Quanto você quer depositar?");
		            x.deposito = sc.nextDouble();
		            
		            System.out.printf("Seu saldo agora é: %.2f%n", x.dinheiro());
		            x.saldo += x.deposito;
		            
		            System.out.print("Deseja repetir (s/n)? ");
		            char resposta = sc.next().charAt(0);

		            if (resposta != 's' && resposta != 'S') {
		                break;
		            }

		           System.out.println("BEM VINDO!");
		 		   System.out.println("faça sua escolha:" );
		 		   System.out.println("1 = DEPOSITAR");
		 		   System.out.println("2 = SACAR ");
		 		   System.out.println("3 = SAIR");
		 		   System.out.print("ESCOLHA: ");
		           x.escolher1 = sc.nextInt();
	        	}
	        	else if(x.escolher1 == 2 && x.saldo > 0) {
	        		System.out.print("Quanto você quer sacar?");
		            x.saque = sc.nextDouble();
		            
		            System.out.printf("Seu saldo agora é: %.2f%n", x.sacar());
		            x.saldo -= x.saque;
		            
		            System.out.print("Deseja repetir (s/n)? ");
		            char resposta = sc.next().charAt(0);

		            if (resposta != 's' && resposta != 'S') {
		                break;
		            }

		           System.out.println("BEM VINDO!");
		 		   System.out.println("faça sua escolha:" );
		 		   System.out.println("1 = DEPOSITAR");
		 		   System.out.println("2 = SACAR ");
		 		   System.out.println("3 = SAIR");
		 		   System.out.print("ESCOLHA: ");
		           x.escolher1 = sc.nextInt();
	        	}
	            
	        }
	        

	        System.out.println("OBRIGADO! Volte sempre.");
		
		
		
		sc.close();
	}
}
