package abstraction;

public class WaterBill implements Bill{
	 private int noOfLitres; 
	    private double costPerLitre; 

	    public WaterBill(int noOfLitres, double costPerLitre) {
	        this.noOfLitres = noOfLitres;
	        this.costPerLitre = costPerLitre;
	    }
	    
	    @Override
	    public double calculateBill() {
	        return noOfLitres * costPerLitre;
	    }
	    
	    
	    @Override
	    public void displayBill() {
	        System.out.println("Water Bill");
	        System.out.println("Number of Liters: " + noOfLitres);
	        System.out.println("Cost per Liter: " + costPerLitre);
	        System.out.println("Total Bill Amount: " + calculateBill());
	    }
	}


