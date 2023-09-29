package Midterm;
public class Employee{
//fields
private int employee_id = 0;
private String employee_name = "";
private int employee_salary = 0;
//constructor
public Employee(int employee_id, String employee_name, int employee_salary){
this.employee_id = employee_id;
this.employee_name = employee_name;
this.employee_salary = employee_salary;
}
//getters
public int getID(){
    return employee_id;
}
public String getName(){
    String firstName = "";
    boolean pastFirst = false;
    String lastName = "";
    int nameLength = employee_name.length();
for (int i = 0; i < nameLength; i++){
    char charComp = employee_name.charAt(i);
    if (pastFirst == true){
        lastName += charComp;
        continue;
    }
    if (Character.isWhitespace(charComp)){
        pastFirst = true;
    } else {
        firstName += charComp;
    }
}
return lastName + ", " + firstName;
}
public int getSalary(){
    return employee_salary;
}
//setters
public void setID(int ID){
employee_id = ID;
}
public void setName(String name){
employee_name = name;
}
public void setSalary(int salary){
employee_salary = salary;
}
}