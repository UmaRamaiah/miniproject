package abstraction;

public class IndianBank extends Bank {
	  private int amount;
	    
		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}

		
		@Override
		int dp() {
			return amount+200;
		}

		@Override
		int withdraw() {
			return dp()-300;
		}

		@Override
		public String toString() {
			return "IndianBank [amount=" + amount + ", dp()=" + dp() + ", withdraw()=" + withdraw() + "]";
		}

}
