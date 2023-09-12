public class ProjectOne{
    public static void main (String[]args){
        int sum = 0;
        for(int i = 0; i <= 999; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
                sum += i;
            } else {
                sum += 0;
            }
        }
        System.out.println(sum);
    }
}