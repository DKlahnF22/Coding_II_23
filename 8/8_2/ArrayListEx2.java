
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx2 {
    public static void main (String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(82);
        list.add(10);
        list.add(47);
        list.add(91);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
            if(num % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
