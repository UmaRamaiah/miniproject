package abstraction;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndianBank i=new IndianBank();
		i.setAmount(5000);
		System.out.println(i);
		
		SBIBank s=new SBIBank();
		s.setAmount(10000);
		System.out.println(s);
	        
	        

	}

}
