public class Casting02 {
    public static void main(String[] args) {
                
        //World population today
        long currentWorldPop = 7_000_000_000L;
        System.out.println("Current World Population: " +currentWorldPop);
        
        //World population in 1950,  Source: United Nations Population Division
        //2.52 Billion
        int africaPop   =   221000000;
        int asiaPop     = 1402000000;
        int europePop   =   547000000;
        int americasPop =   339000000;
        int oceanaPop   =    13000000;
        System.out.println("World Population in 1950: " +((long)africaPop +asiaPop +europePop +americasPop +oceanaPop));
        
        //The current population of Asia is an estimated 60% of the world population
        double percentAsia = 0.6;
        double currentAsiaPop = currentWorldPop * percentAsia;
        System.out.println("Current Asia Population: " +(long)currentAsiaPop);      
       
    }  
}