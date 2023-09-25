

public class Prisoner {
    //Fields 
    public String name;
    public double height;
    public int sentence;
    
    //Constructor
    public Prisoner(String name, double height, int sentence){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void getInfo(){
        this.getInfo(false);
    }
    public void getInfo(boolean thinker){
        System.out.println(name);
        System.out.println(height);
        System.out.println(sentence);
        if (thinker == true){
            this.think();
        }
    }
}
