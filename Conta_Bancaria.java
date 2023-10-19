package util;

public class Banco {
		private int number;
		private  String holder;
		private double balance;
		
		
		public Banco(int number, String holder) { // o primeiro construtor é para se a opçao do usuario nao ter valor de deposito inicial
			
			this.number = number;
			this.holder = holder;
		}
		public Banco(int number, String holder, double valueInitial) { // A segunda opçao é para ter valor inicial
			super();
			this.number = number;
			this.holder = holder;
			deposit(valueInitial);// Fazendo com que o valor inicial seja unico, para n precisar mudar duas coisas caso seja a vontade do cliente.
		}
		public int getNumber() { //Fazendo com que o atributo "number" tenha somente GET, pois ele é fixo.
			return number;
		}
		
		public String getHolder() {
			return holder;
		}
		public void setHolder(String holder) {
			this.holder = holder;
		}
		public double getBalance() {// o atributo "balance" so tem GET pois o valor que pode ser mudado so poder se pelo metodo de saque e deposito.
			return balance;
		}
		public double deposit(double deposito) { //colocando o metodo de deposito do usuario
			return balance += deposito;
		}
		public double Saque(double saque) { // colocando o metodo de saque do usuario
			return balance -= saque;
		}
		public String toString() {
			return "account"
					+ number
					+ ", holder:"
					+holder
					+ ", balance:$"
					+ String.format("%.2f", balance);
		}
		

		
}
		
		

