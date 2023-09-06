import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color code.");
        double waveLength = sc.nextDouble();
        sc.close();
        if (waveLength >= 380 && waveLength <= 450){
            System.out.println("Violet.");
        } else if (waveLength >= 450 && waveLength <= 495){
            System.out.println("Blue.");
        } else if (waveLength >= 495 && waveLength <= 570){
            System.out.println("Green.");
        } else if (waveLength >= 570 && waveLength <= 590){
            System.out.println("Yellow.");
        } else if (waveLength >= 590 && waveLength <= 620){
            System.out.println("Orange.");
        } else if (waveLength >= 620 && waveLength <= 750){
            System.out.println("Red.");
        }
        }
    }