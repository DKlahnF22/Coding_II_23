//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10

public class Prisoner {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell prisonerCell;
    
    //Constructor
    public Prisoner(String name, double height, int sentence, Cell prisonerCell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.prisonerCell = prisonerCell;
    }
    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Height: " +height);
        System.out.println("Sentence: " +sentence);
        System.out.println("Cell name: " + prisonerCell.getCellName());
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

    public int getSentence(){
        return sentence;
    }

    public void changeName(String name1){
        name = name1;
    }

    public void changeHeight(double height1){
        height = height1;
    }

    public void changeSentence(int sentence1){
        sentence = sentence1;
    }
}