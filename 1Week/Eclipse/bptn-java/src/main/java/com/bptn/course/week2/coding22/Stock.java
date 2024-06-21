package com.bptn.course.week2.coding22;

public class Stock {

    // Create instance variables 
    String tickerSymbol ;
    String companyName ;
    int price ;
    double percentChange ;
    int totalShares ;
    long marketCap ;

    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase() ;
        this.companyName = companyName ;
        this.price = price ;
        this.totalShares = totalShares ;
        
        percentChange = 0;
        marketCap = totalShares * price ;
        
    }

    // Create the methods 
    public void adjustPrice(int change) {
    	
    	price += change ;
    	percentChange = ((double) change / (double) price ) * 100  ;
    	marketCap = totalShares * price ;
    }
    
    public String toString() {
    	String percentChangeFormat = percentChange == 0 ? "0.0%" : String.format("%.16f%%", percentChange) ;
//    			if (percentChange == 0) {
//    		percentChangeFormat = "0.0%" ;
//    	} else {
//    		String.format("%.16%%", percentChange) ;
//    	}
    	return String.format("Ticker Symbol: %s\n Company: %s\n Current Price: $%d (%s)\n Market Cap: $%d", tickerSymbol, companyName, price, percentChangeFormat, marketCap);
    			
    			
    			}
    
    
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}

