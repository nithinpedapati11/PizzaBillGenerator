package PizzaBillGenerator;

public class DeluxePizza extends Pizza {

	public DeluxePizza(Boolean veg) {
		super(veg);
                super.addExtraCheese();
                super.addExtraOnion();
                super.addExtraTomato();
	}
	@Override
	public void addExtraCheese() {
            System.out.println("Deluxe Cheese: "+extraCheesePrice);
	}
	@Override
	public void addExtraOnion() {
            System.out.println("Deluxe Onion: "+extraOnionPrice);
	}
	@Override
	public void addExtraTomato() {
            System.out.println("Deluxe Tomato: "+extraTomatoPrice);	
	}	
}

