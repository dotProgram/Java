package com.stockmanagement.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class StockDetailsBean { 
	public	StockDetailsBean() { 
	//System.out.println("BEAN StockDetailsBean.BEAN.java INITILIZED FOR *GETTERS AND SETTERS*");	
}
	@Autowired
	public	void ajp(String ajp) { 
	System.out.println("----------------ajp-----------------");	
	System.out.println("----------------String----------------- : "+ajp);	
}
	
	private int Id;
	private String stockNameListed;
    private String stockNameTitle;
	private String stockDiscription;
	private String stockSector;
	private double stockPriceAtTheTimeOfPurchase;
	private String stockDateOfPurchase;
	private double currentStockPrice; 
	private double numberOfStocks;
	private int idOfStockHolder;

	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getStockNameTitle() {
		return stockNameTitle;
	}
	public void setStockNameTitle(String stockNameTitle) {
		this.stockNameTitle = stockNameTitle;
	}
	public String getStockDiscription() {
		return stockDiscription;
	}
	public void setStockDiscription(String stockDiscription) {
		this.stockDiscription = stockDiscription;
	}
	public String getStockSector() {
		return stockSector;
	}
	public void setStockSector(String stockSector) {
		this.stockSector = stockSector;
	}
	public double getStockPriceAtTheTimeOfPurchase() {
		return stockPriceAtTheTimeOfPurchase;
	}
	
	public String getStockDateOfPurchase() {
		return stockDateOfPurchase;
	}
	public void setStockDateOfPurchase(String stockDateOfPurchase) {
		this.stockDateOfPurchase = stockDateOfPurchase;
	}
	public double getCurrentStockPrice() {
		return currentStockPrice;
	}

	public double getNumberOfStocks() {
		return numberOfStocks;
	}
	public void setNumberOfStocks(double numberOfStocks) {
		this.numberOfStocks = numberOfStocks;
	}
	public int getIdOfStockHolder() {
		return idOfStockHolder;
	}
	public void setIdOfStockHolder(int idOfStockHolder) {
		this.idOfStockHolder = idOfStockHolder;
	}
	public String getStockNameListed() {
		return stockNameListed;
	}
	public void setStockNameListed(String stockNameListed) {
		this.stockNameListed = stockNameListed;
	}
	public void setStockPriceAtTheTimeOfPurchase(double stockPriceAtTheTimeOfPurchase) {
		this.stockPriceAtTheTimeOfPurchase = stockPriceAtTheTimeOfPurchase;
	}
	public void setCurrentStockPrice(double currentStockPrice) {
		this.currentStockPrice = currentStockPrice;
	}

	}