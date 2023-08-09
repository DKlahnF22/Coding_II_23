public class Cat {
    //Properties (fields)
    public String name = "Pal";
    public int age = 6;
    public String breed = "tabby";
    public String favoriteF = "Chimken";

    //Behaviors (methods)
    public void makeMeowSound (){
        System.out.println("Meow!");
    }
    public void Play (){
        System.out.println(name + " is playing!");
    }
    public void Wash (){
        System.out.println("You wash " + name + "!");
    }
    public void Eat (){
        System.out.println("You feed " + name + " some " + favoriteF + "!");
    }
    public void Hunt (){
        System.out.println(name + " is hunting!");
    }
}