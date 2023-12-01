package chainpattern;

public class ChainMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain addchain=new Addition();
		Chain subchain=new Subtraction();
		
			addchain.setNextChain(subchain);
			Numbers requst=new Numbers(4, 2, "add");
            addchain.calculate(requst);



	}

}
