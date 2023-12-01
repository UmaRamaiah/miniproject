package abstraction;

public class EBill implements Bill{
	 private int noOfUnits; // Number of units consumed
	    private double costPerUnit; // Cost per unit

	    public EBill(int noOfUnits, double costPerUnit) {
	        this.noOfUnits = noOfUnits;
	        this.costPerUnit = costPerUnit;
	    }

	    @Override
	    public double calculateBill() {
	        return noOfUnits * costPerUnit;
	    }

	    @Override
	    public void displayBill() {
	        System.out.println("Electricity Bill");
	        System.out.println("Number of Units: " + noOfUnits);
	        System.out.println("Cost per Unit: " + costPerUnit);
	        System.out.println("Total Bill Amount: " + calculateBill());
	    }
	}

	

