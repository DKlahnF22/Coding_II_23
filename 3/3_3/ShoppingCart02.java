public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.
        double price = 25.50;
        double tax = 1.15;   
        int quantity = 5;
        double totalPrice;
        
        // Declare and assign a calculated totalPrice
        totalPrice = price * quantity * tax;
        
        // Modify message to include quantity 
        message = custName+" wants to purchase "+quantity +" " +itemDesc;
        
        System.out.println(message);
        
        // Print another message with the total cost
        System.out.println("Total cost with tax is: "+totalPrice);

    }    
}