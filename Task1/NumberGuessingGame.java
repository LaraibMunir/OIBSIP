//cnumber = right guess_num

import java.util.Random;
import java.util.Scanner;

public class guessgame {
  public static void main(String[] args) {
    Random Random_number= new Random();
    int cnumber=Random_number.nextInt(100);
    int turns=5;

    Scanner scan=new 
Scanner(System.in);

       System.out.println("Welcome in NUMBER GUESSING GAME");
       System.out.println("\nYou have to guess a number between 1 to 100");
       System.out.println("\nYou will have 5 turns!" );
    System.out.println("\nBest of Luck!");
    System.out.println("\n");
    

int n=5;
while(n>0) {
   

    int guess_num;
    int i=0;
  
      System.out.println("\nEnter a guess number: ");

      guess_num=scan.nextInt();
      turns--;
    
    if(guess_num==cnumber)
   {
      System.out.println("\nWin");
    }

    else{
      System.out.println("\nYou loose!");
      System.out.println("\nTurns left: "+turns);

              if(guess_num<cnumber) {
                                System.out.println("\nYour number is lower than actual number");
              }
            else{
                System.out.println("\nYour number is greater then actual number");
            }

           }
n--;
   }

System.out.println("\nThe correct number is: "+cnumber);

   }
}
