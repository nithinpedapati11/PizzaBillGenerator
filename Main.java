
package PizzaBillGenerator;

public class Main {
public static void main(String[] args) {
       
		
		DeluxePizza dp=new DeluxePizza(false);
		dp.addExtraTomato();
		dp.addExtraCheese();
        dp.takeaway();
		dp.getBill();
		dp.getBillWithTax();
    }
    
}