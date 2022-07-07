package com.bridgelabs.stockaccount;

import java.util.Scanner;

import util.StockValue;

public class StockReport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * To calculate total stock value price of each company
		 * stock names array is the array of companies in which stocks are held
		 * numberOfEachShare is the array of number of shares in each company
		 * sharePrice is the array of price of each share
		 * Stock Report is calculated by calculating with number of shares * price of each share
		 * Total value is calculated by adding total price of all companies
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of shares");
		int numberOfShares = scanner.nextInt();                    // total number of companies holding shares
		String[] stockNames = new String[numberOfShares];         // names of companies holding shares         
		int[] numberOfEachShare = new int[numberOfShares];        // number of shares in each company
		int[] sharePrice = new int[numberOfShares];               // price of each share in different companies
		int sumOfShares = 0;
		
		System.out.println("Enter stock names in array");
		for(int i=0; i< numberOfShares; i++){
			stockNames[i] = scanner.next();
		}
		
		System.out.println("Enter number of shares in each stock ");
		for(int i=0; i< numberOfShares; i++){
			numberOfEachShare[i] = scanner.nextInt();
		}
		
		System.out.println("Enter pricee of shares in each stock ");
		for(int i=0; i< numberOfShares; i++){
			sharePrice[i] = scanner.nextInt();
		}
		
		StockValue stockValue = new StockValue(numberOfEachShare, sharePrice, numberOfShares);   // calculating the stock value of each company
		int [] value = stockValue.totalSharePrice();
		for(int i =0 ; i<numberOfShares; i++ ){
			System.out.println("Total value of "+stockNames[i]+" is "+value[i]);                // printing share value of each company
			sumOfShares = sumOfShares + value[i];                                               // total value of shares from all companies
		}
		
		System.out.println("Total value of all shares "+sumOfShares);                          // printing stock report
		
	}

}
