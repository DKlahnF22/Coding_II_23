public class ID_NumTest{
    public static void main (String[]args){
        ID_Num id1 = new ID_Num();
        ID_Num id2 = new ID_Num("55-1234");
        ID_Num id3 = new ID_Num("76-4236");
        ID_Num id4 = id1;
        id4.setID("28-3597");
        ID_Num id5 = new ID_Num("98-2230");
        ID_Num id6 = new ID_Num (id5);

        System.out.println(id1.getID());
        System.out.println(id2.getID());
        System.out.println(id3.getID());
        System.out.println(id4.getID());
        System.out.println(id5.getID());
        System.out.println(id6.getID());
    }
}