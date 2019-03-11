// A Cash object represents an amount of money held by an investor.
   public class Cash implements Asset {
       private double amount; // amount of money held

       // constructs a cash investment of the given amount
       public Cash(double amount) {
           this.amount = amount;
 		}

      // returns this cash investment's market value, which
      // is equal to the amount of cash
      public double getMarketValue() {
      	return amount;
      }
      public double getProfit(){
      	return 0.0;
      }

      public void setAmount(double amount){
      	this.amount = amount;
      }

   }
