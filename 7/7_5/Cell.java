
public class Cell {
    private String name;
    private boolean doorOpened;
    private int cellCode;
    public Cell(String name, boolean doorOpened, int cellCode){
        this.name = name;
        this.doorOpened = doorOpened;
        this.cellCode = cellCode;
    }
    public String getCellName(){
        return name;
    }
    public boolean getDoorStatus(){
        return doorOpened;
    }
    public void cellControl(int codeInput){
        if (codeInput == cellCode){
            System.out.println("Access: Granted");
            if (doorOpened == true){
                doorOpened = false;
                System.out.println("Door: Closed");
            } else {
                doorOpened = true;
                System.out.println("Door: Opened");
            }
        } else {
            System.out.println("Access: Denied");
        }
    }
}
