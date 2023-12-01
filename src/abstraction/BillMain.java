package abstraction;

public class BillMain {

	public static void main(String[] args) {
		
        EBill EBill = new EBill(100, 12);
        WaterBill waterBill = new WaterBill(500, 30);

        
        EBill.displayBill();
        System.out.println();
        waterBill.displayBill();
	}

}
