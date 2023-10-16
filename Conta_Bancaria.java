package util;

public class Conta_Bancaria {
			public double saldo = 0;
			public double deposito = 0;
			public double saque;
			public int escolher1;
			
			
			public double dinheiro() {
				return saldo + deposito;
			}
			public double sacar() {
				return saldo - saque;
			}
}
