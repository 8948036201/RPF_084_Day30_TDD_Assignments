package com.bridgelabz.tdd;

public class InvoiceGenerator {
	private static int costPerTime = 1;
	private static double minimumCostPerKilometer = 10;
	private static double minimumFare = 5;

	public static void main(String[] args) {
		double distance = 5.0; 
		int time = 1;
		double totalFare = distance * minimumCostPerKilometer + time * costPerTime;
		if (totalFare < minimumFare) {
			System.out.println(minimumFare);
		}
		System.out.println(totalFare);
	}
}