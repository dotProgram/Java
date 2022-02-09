package com.stockmanagement.services;

public class StockValuation {
	
public static float netValuation(double curretRate, double stockPriceAtTheTimeOfPurchase, double totalNoOfStocks){
	 
	float netRate =  (float) ((float)(curretRate - stockPriceAtTheTimeOfPurchase)* totalNoOfStocks);
	//double rRate=(lastRate - curretRate)*totalNoOfStocks;
	System.out.println(" totalNoOfStocks netRate = "+netRate);
//	System.out.println("totalNoOfStocks rev netRate = "+rRate);
    return netRate;	
}
	
public static double netValuation(){
	double curretRate=900;
	double lastRate=1500;
	double totalNoOfStocks=2500;
	double netRate=(curretRate - lastRate)*totalNoOfStocks;
	double rRate=(lastRate - curretRate)*totalNoOfStocks;
	System.out.println(" totalNoOfStocks netRate = "+netRate);
	System.out.println("totalNoOfStocks rev netRate = "+rRate);
    return 0;	
}	
	
	
	
	public static void main(String[] args) {
		netValuation();
	}
		
	}
	
	


