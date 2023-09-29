package String_Project;

public class TestingStuff {
 public static void main (String[] args){
    String Testing = "Why won't you work";
    String reverseInput = "";
    int stringLength = Testing.length();
    //char[] testing = Testing.toCharArray();
    CharSequence Testing1 = Testing.subSequence(0, stringLength);
    System.out.println(Testing1);
    for(int i = 0; i < stringLength; i++){
      char charComp = Testing.charAt(i);
      if (Character.isLowerCase(charComp)){
         reverseInput += Character.toUpperCase(charComp);
      } else if (Character.isUpperCase(charComp)){
         reverseInput += Character.toLowerCase(charComp);
      } else {
         reverseInput += charComp;
      }
    }
    System.out.println(reverseInput);
    int charAmount = 0;
    for(int i = 0; i < stringLength; i++){
      char charComp = Testing.charAt(i);
      if (Character.equals()){
          charAmount += 1;
      } else{
          charAmount += 0;
      }
  }
  System.out.println(charAmount);
 }
}
