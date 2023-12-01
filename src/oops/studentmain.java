package oops;

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 student s1=new student();
	        s1.sId=1001;
	        s1.sName="nikitha";
	        s1.m1=78;
	        s1.m2=90;
	        s1.m3=67;
	        s1.m4=88;
	        s1.m5=66;
	        System.out.println("The Student id=:"+s1.sId);
	        System.out.println("The Student Name=:"+s1.sName);
	        System.out.println("The Student mark1=:"+s1.m1);
	        System.out.println("The Student mark2=:"+s1.m2);
	        System.out.println("The Student mark3=:"+s1.m3);
	        System.out.println("The Student mark4=:"+s1.m4);
	        System.out.println("The Student mark5=:"+s1.m5);
	        System.out.println("Percentage=:"+s1.percentage());
	        System.out.println("===============================");
	        student s2=new student();
	        s2.sId=1002;
	        s2.sName="vaishnavi";
	        s2.m1=98;
	        s2.m2=96;
	        s2.m3=69;
	        s2.m4=58;
	        s2.m5=86;
	        System.out.println("The Student id=:"+s2.sId);
	        System.out.println("The Student Name=:"+s2.sName);
	        System.out.println("The Student mark1=:"+s2.m1);
	        System.out.println("The Student mark2=:"+s2.m2);
	        System.out.println("The Student mark3=:"+s2.m3);
	        System.out.println("The Student mark4=:"+s2.m4);
	        System.out.println("The Student mark5=:"+s2.m5);
	        System.out.println("The percentage=:"+s2.percentage());

	}

}
