package Midterm;

public class Rectangle {
    //fields
    int length = 0;
    int width = 0;

    //constructor
public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    
}
//methods
public void findPerimeter(){
    System.out.println("Total perimeter is: " + ((length * 2) + (width * 2)));
}

public void findArea(){
    System.out.println("Total area is: " + (length * width));
}
}