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
    for(stringLength -= 1; stringLength >= 0; stringLength--){
    char charComp = myString.charAt(stringLength);
      reverseInput += charComp;
    }
    return reverseInput;
}
public String reverseCase(){
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
public String eachWordOnALine(){
    int stringLength = myString.length();
    String annoying = "       ";
    for(int i = 0; i <stringLength; i++){
        char charComp = myString.charAt(i);
        annoying += charComp;
        if(Character.isWhitespace(charComp)){
            annoying += "\n       ";
        }
    }
    return annoying;
}
public int characterCount(){
int stringLength = myString.length();
    int charAmount =0;
    for(int i = 0; i < stringLength; i++){
        char charComp = myString.charAt(i);
        if (Character.isWhitespace(charComp)){
            
        } else{
            charAmount += 1;
        }
    }
    return charAmount;
}
public int characterCount(char Ilym){
    int stringLength = myString.length();
    int charAmount =0;
    for(int i = 0; i < stringLength; i++){
        char charComp = myString.charAt(i);
        if (charComp == Ilym){
            charAmount += 1;
        } else{
            
        }
    }
    return charAmount;
}
public int wordCount(){
    int stringLength = myString.length();
    int gangnam = 0;
    for(int i = 0; i <stringLength; i++){
        char charComp = myString.charAt(i);
        if(Character.isAlphabetic(charComp)){
        } else {
            gangnam += 1;
        }
    }
    return gangnam;
}
public double avgWorldLength(){
    double ne = characterCount()+.0;
    //formula is total character amount divided by total word
    return ne/wordCount();
}
public int vowelCount(){
    int stringLength = myString.length();
    int count = 0;
    for(int i = 0; i <stringLength; i++){
        char charComp = myString.charAt(i);
        if(charComp == 'a' || charComp == 'e' || charComp == 'i' || charComp == 'o' || charComp == 'u' || charComp == 'A' || charComp == 'E' || charComp == 'I' || charComp == 'O' || charComp == 'U'){
            count += 1;
    }
}
return count;
}
public int substrCount(){
int count = 0;
int stringLength = myString.length();
for(int i = 0; i <stringLength; i++){
        char charComp = myString.charAt(i);
        if(charComp == 's'){
            count += 1;
        } else {
            
        }
    }
return count;
}
public boolean isPalindrome(){
    boolean palindrome = false;
    int stringLength = myString.length();
    String reversedString = "";
    String initalString = "";
    for(int i = 0; i <=stringLength; i++){
    char charComp = myString.charAt(stringLength);
      if(Character.isAlphabetic(charComp)){
        if(Character.isUpperCase(charComp)){
            Character.toLowerCase(charComp);
            initalString += charComp;
            reversedString += charComp;
        } else {
            initalString += charComp;
            reversedString += charComp;
        }
      } else{
      }
    int stringLengthR = reversedString.length();
      for(stringLengthR -= 1; stringLengthR >= 0; stringLengthR--){
    char charComp1 = myString.charAt(stringLengthR);
      reversedString += charComp1;
    }
    }
    System.out.println("Current reversed string: " + reversedString);
    if(reversedString.contentEquals(initalString)){
        palindrome = true;
    } else {
    }
    return palindrome;
}
}
