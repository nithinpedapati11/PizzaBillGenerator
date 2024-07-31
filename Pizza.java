package PizzaBillGenerator;

public class Pizza {
	private int price;
	//@SuppressWarnings("unused")
	private Boolean veg; //true is veg, false is non veg
	//using wrapper classes to wrap the boolean type into bool objects
	
	final int basePizzaPrice;
	final int extraCheesePrice=40;
	final int extraOnionPrice=30;
	final int extraTomatoPrice=35;
	final int takeawayPrice=25;
	
	public Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg=veg) {
			this.price=300;
		}
		else {
			price=400;
		}
		basePizzaPrice=this.price;
	}
	
	private boolean isExtraCheeseAdded;
	private boolean isExtraOnionAdded;
	private boolean isExtraTomatoAdded;
	private boolean isTakeawayOpted;
	
	
	public void addExtraCheese(){
		isExtraCheeseAdded = true;
		System.out.println("Added extra cheese!");
		this.price+=extraCheesePrice;
	}
	
	public void addExtraOnion() {
		if(isExtraOnionAdded==true){
		System.out.println("Added extra onion!");
		this.price+=extraOnionPrice;}
	}
	
	public void addExtraTomato() {
		isExtraTomatoAdded=true;
		System.out.println("Added extra tomato!");	
		this.price+=extraTomatoPrice;
	}
	
	public void takeaway() {
		isTakeawayOpted=true;
		System.out.println("Takeaway opted");
		this.price+=takeawayPrice;
	}
	
	public void getBill() {
		String bill="";
		System.out.println("Pizza: "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			System.out.println("Extra Cheese: "+extraCheesePrice);
		}
		if(isExtraOnionAdded==true) {
			System.out.println("Extra Onion: "+extraOnionPrice);
		}
		if(isExtraTomatoAdded) {
			System.out.println("Extra Tomato: "+extraTomatoPrice);
		}
		if(isTakeawayOpted) {
			System.out.println("Packing charges: "+takeawayPrice);
	}
	bill+= "Bill: "+this.price;	
	}
	
	public void getBillWithTax() {
		this.price=(int)(1.095*this.price);
		System.out.println("Total with GST: "+this.price+"\n");
	}
}

    
