public class Calculator2 {
    public double tax = 1.05;
    public double tip = 1.15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(){
        //Calculate an individual's total after tax and tip
        double totalPerPerson = ((originalPrice * tax) * tip);
        //Print this value
        System.out.println("Total price: " + totalPerPerson);
        
    }
}
