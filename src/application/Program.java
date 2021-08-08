package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("What is dollar price? ");
	double currentDollar = sc.nextDouble();
	System.out.print("How man dollars will be bought? ");
	double quantityDollar = sc.nextDouble();
	
	System.out.println("Amount to be paid is reais = " + String.format("%.2f", CurrencyConverter.converter(currentDollar, quantityDollar)));
	
	sc.close();
	}

}
