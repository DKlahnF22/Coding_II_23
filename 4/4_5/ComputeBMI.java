import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{       
            Scanner sc = new Scanner(System.in);
            double BMI;
            System.out.println(" It is I, R.A.I.N. Please input your weight.");
            double userWeight = sc.nextDouble();
            System.out.println("Now input your height.");
            double userHeight = sc.nextDouble();
            //body mass index should = 24

            sc.close();
            //math section
            System.out.println("Calculating...");
            BMI = Math.ceil((userWeight / (userHeight * userHeight)) * 703.0);
            System.out.println("BMI Total: " + BMI);
        }
}