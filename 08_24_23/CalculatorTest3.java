public class CalculatorTest3 {
    public static void main(String[] args) {
        
       Calculator3 calc = new Calculator3();
    
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
        calc.findTotal(10, "Person one");
        calc.findTotal(12, "Person two");
        calc.findTotal(9, "Person three");
        calc.findTotal(8, "Person four");
        calc.findTotal(7, "Person five");
        calc.findTotal(15, "Alex");
        calc.findTotal(11, "Person seven");
        calc.findTotal(30, "Person eight");
        
    
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}