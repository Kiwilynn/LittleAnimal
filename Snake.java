import java.util.*;

public class Snake implements Runnable{

   private int y;
   public static int snakeX;
   public static int snakeY;
   static Scanner scan = new Scanner(System.in);


public Snake(int snakeX, int snakeY){

   this.snakeX = snakeX;
   this.snakeY = snakeY;

}

public void run(){

   System.out.println("Hello and welcome to 'Little Animal Horror Zoo'");
   System.out.println("The controls are using the input 1, 2, 3 and 4 and then hitting enter");
   while (Rabbit.b == true){
    
   System.out.println("snake is at : " + snakeX + "," + snakeY);
  
   
     
   if (snakeX == Rabbit.rabbitX && snakeY == Rabbit.rabbitY){
   System.out.println("Victory");
   Rabbit.b = false;
   break;
   } 
   //Scanner for user input  
   y = scan.nextInt();
   if(y == 1){
   snakeX++;
   }
   else if (y == 2){
   snakeX--;
   }
   else if (y == 3){
   snakeY++;
   }
   else if (y == 4){
   snakeY--;
   }
   /*else{
   System.out.println(y + " is not a valid number \nFuck you and fuck this game.");
   
   try {
   Thread.sleep(2000);
   } 
   catch(InterruptedException ie) {} 
   for(int i=1;i<500000000;i++){
   System.out.println("Fuck you.");
   } 
   }*/
   

  

}

}
}