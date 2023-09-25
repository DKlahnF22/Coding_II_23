public class SavingsBond {
    public int term;
    public double purchasePrice;
    public double interestRate;
    public double bondReturn;
    public SavingsBond(int userTerm, double userAmount){
        term = userTerm;
        purchasePrice = userAmount;
        if(userTerm >= 0 && userTerm <= 11){
            interestRate = 0.005;
        } else if (userTerm >= 12 && userTerm <= 23){
            interestRate = 0.01;
        } else if (userTerm >= 24 && userTerm <= 35){
            interestRate = 0.015;
        } else if (userTerm >= 36 && userTerm <= 47){
            interestRate = 0.02;
        } else if(userTerm >= 48 && userTerm <= 60){
            interestRate = 0.025;
        } else {
            System.out.println("Non-term number, please try again.");
        }
        bondReturn = (userAmount * (Math.pow(1 + interestRate, term)));
        System.out.println("Bond will return: " + bondReturn);
        System.out.println("Interest rate: " + interestRate);
    }
}
