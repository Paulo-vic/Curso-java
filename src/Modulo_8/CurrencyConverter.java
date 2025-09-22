package Modulo_8;

import java.util.Scanner;

public class CurrencyConverter {
		static Scanner sc = new Scanner(System.in);
		
		static double dollarValue, amount;
		static final double IOF = 0.06;
		
		public static void setDollar() {
			System.out.print("Enter the current value of the dollar: ");
			dollarValue = sc.nextDouble();
		}
		public static void buyAmount() {
			System.out.print("Enter how many dollars you will buy: ");
			amount = sc.nextDouble();
		}
		public static void reaisValue() {
			System.out.println("The amount to be paid in Reais after with fees wil be: " + ((dollarValue * amount) + IOF *(dollarValue * amount)) + " R$");
			
		}
		
}
