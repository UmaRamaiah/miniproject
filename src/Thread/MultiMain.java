package Thread;

public class MultiMain {


		// TODO Auto-generated method stub
		public static void main(String[] args) {
			   Table t=new Table();
			   FirstThread f=new FirstThread(t);
			   f.start();
			   SecondThread s=new SecondThread(t);
			   s.start();

			


	}

}
