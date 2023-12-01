package abstraction;

public class SBIBank extends Bank{
	  private int amount;
	    
			public int getAmount() {
				return amount;
			}

			public void setAmount(int amount) {
				this.amount = amount;
			}

			
			@Override
			int dp() {
				return amount+2000;
			}

			@Override
			int withdraw() {
				return dp()-3000;
			}

			@Override
			public String toString() {
				return "SBI [amount=" + amount + ", dp()=" + dp() + ", withdraw()=" + withdraw() + "]";
			}
}
	    

