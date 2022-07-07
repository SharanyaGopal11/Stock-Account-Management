package util;

public class StockValue {
	int[] sharePrice;                    //price of each share in different companies
	int[] numberOfEachShare;             // number of shares in each company
	int numberOfShares;                  // total number of companies holding shares
	int [] totalSharePrice;               // price of each share in different companies
	
	public StockValue(int[] numberOfEachShare, int[] sharePrice, int numberOfShares){
		this.numberOfEachShare = numberOfEachShare;
		this.sharePrice = sharePrice;
		this.numberOfShares = numberOfShares;
	}
	
	public int[] totalSharePrice(){											// calculating the stock value of each company
		int [] totalSharePrice = new int[numberOfShares];                   // share price of each company
		for(int i = 0; i< this.numberOfShares; i++){
			totalSharePrice[i] = numberOfEachShare[i] * sharePrice[i];
		}
		return totalSharePrice;
	}

}
