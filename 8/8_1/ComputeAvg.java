import java.util.Scanner;
public class ComputeAvg {
    //fields
    public static void main(String args[]) {
    int[] scores = new int[5];
    Scanner sc = new Scanner(System.in);
    double sum = 0.0, avg = 0.0;
    //methods
    System.out.println("Input five test scores.");
    for(int i = 0; i < scores.length; i++) {
        scores[i] = sc.nextInt();
    }
    sc.close();
    for(int i = 0; i < scores.length; i++) {
        sum = sum + scores[i];
        avg = sum / scores.length;
    }
    System.out.println("Average score: " + avg);
    }
}
