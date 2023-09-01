public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        double tableTotal = 0;
        //Name your friends
        tableTotal += calc.findTotal(10, "Avery");
        tableTotal += calc.findTotal(12, "Jacob");
        tableTotal += calc.findTotal(9,  "Tanner");
        tableTotal += calc.findTotal(8,  "Chloe");
        tableTotal += calc.findTotal(7,  "Josiah");
        tableTotal += calc.findTotal(15, "Alex");
        tableTotal += calc.findTotal(11, "Eduardo");
        tableTotal += calc.findTotal(30, "Forgetful");

        //Find and print the entire table's total, including tax and tip
       System.out.println("Table Total: " + tableTotal);
    } 
}