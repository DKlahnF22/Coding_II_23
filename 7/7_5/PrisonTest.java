//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class PrisonTest {
    public static void main(String[] args){
        Cell cell1 = new Cell("A1", false, 4845);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cell1);
        bubba.display();
        cell1.cellControl(1285);
        cell1.cellControl(4845);
        cell1.cellControl(9475);
    }
}
