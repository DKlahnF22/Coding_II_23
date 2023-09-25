
public class LoopShape {
    static void createRectangle(int width, int height){
        int blankSpace = width - 2;
        // subtract 2 from height to account for the top and bottom of the square
        height -= 2;
        String blank = "";
        // sets up the blank space in the square as a string
        for(int i = 0; i < blankSpace; i++){
            blank += " ";
        }
        System.out.println(blank);
        System.out.println("Blankspace: " + blankSpace);
        //Draw a Rectangle
        // checks if it's less than 1
        if(width <= 0 || height <= 0){
            System.out.println("Cannot compute. Please try again.");
        } else {
            // does the first row
            for(int i = 0; i < width; i++){
                System.out.print('#');
            }
            System.out.println();
            // does all inbetween rows
            for(int i = 0; i < height; i++){
                System.out.println('#' + blank + '#');
            }
            //does the bottom row
            for(int i = 0; i < width; i++){
                System.out.print('#');
            }
        }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        
    }
}
