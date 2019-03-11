public class DividendStock extends Stock {
 	 	private double dividends;
 	 	public DividendStock(String symbol, double currentPrice){
 	 		super(symbol, currentPrice);
 	 		dividends = 0.0;
 	 	}
 	 	public double getMarketValue(){
 	 		return super.getMarketValue() + dividends;
 	 	}
 	 	public void payDividend(double amountPerShare){
 	 		dividends += amountPerShare * getTotalShares();
 	 	}
  }
