package String_Project;

public class StringProject {
    private String myString;
public StringProject (String str) {
    myString = str;
}
public String toString() {
    return myString;
}
public String reverseString(){
    int stringLength = myString.length();
    String reverseInput = "";
    for(int i = 0; i < stringLength; i++){
    char charComp = myString.charAt(i);
      if (Character.isLowerCase(charComp)){
         reverseInput += Character.toUpperCase(charComp);
      } else if (Character.isUpperCase(charComp)){
         reverseInput += Character.toLowerCase(charComp);
      } else {
         reverseInput += charComp;
      }
    }
    return reverseInput;
}
public int characterCount(){
    int stringLength = myString.length();
    int charAmount =0;
    for(int i = 0; i < stringLength; i++){
        char charComp = myString.charAt(i);
        if (charComp == 'a'){
            charAmount += 1;
        } else{
            
        }
    }
    return charAmount;
}
}
