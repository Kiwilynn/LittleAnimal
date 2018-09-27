import java.util.*;

public class Rabbit implements Runnable {
  
   private int x;
   public static int rabbitX;
   public static int rabbitY;
   public static boolean b = true;

public Rabbit(){

   rabbitX = 7;
   rabbitY = 7;
}


   //Rabbit's movement behavior
public void run(){
 
 
   //Start off with sleeping for time to read message.
   try {
   
   Thread.sleep(5000);
   } 
   catch(InterruptedException ie) {}

 
   while (b = true){
   
   System.out.println("I am at : " + rabbitX + "," + rabbitY);
   //Makes x a random number between 1 and 4 both included
   int x = (int) ((Math.random()*4)+1);
     
   if (rabbitX == Snake.snakeX && rabbitY == Snake.snakeY){
   System.out.println("Arrrgh I am dead");
   break;
   }
   
   else if((rabbitX - Snake.snakeX) <= 1){
   System.out.println("No! Mercy!!");
   }
   
   else if(rabbitX == 9 && x == 1){
   System.out.println("There's a wall in the way!"); 
   }
   
   else if (x == 1){
   rabbitX++;
   }
   else if (rabbitX == 0 && x == 2){
   System.out.println("There's a wall in the way!");
   }
   else if (x == 2){
   rabbitX--;
   }
   else if (rabbitY == 9 && x == 3){
   System.out.println("There's a wall in the way!");
   }
   else if (x == 3){
   rabbitY++;
   }
   else if (rabbitY == 0 && x == 4){
   System.out.println("There's a wall in the way!");
   }
   else if (x == 4){
   rabbitY--;
   }
   else if (rabbitX == 9 && x == 1){
   System.out.println("There's a wall in the way!"); 
   }
     
     
 
   //Makes the method "sleep" for 5 second then prints rabbit location
   try {
   Thread.sleep(3000);
   } 
   catch(InterruptedException ie) {} 
   
}
}
}