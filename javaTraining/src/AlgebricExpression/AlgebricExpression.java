package AlgebricExpression;

public class AlgebricExpression {
		public static double getTotal (int quantity, double price, double percent) {
			double total = quantity * price * (1.0 - (percent / 100.0) );
			return total;
		}
		
		
		public static void main (String[] args) {
			double amount1 = getTotal (12, 3.50, 7.5);
			double amount2 = getTotal (14, 3.05, 9.25) ;
			System.out.printf("Amount1: $%.2f\n", amount1);
			System.out.printf("Amount2: $%.2f\n", amount2);
		}
	

}
