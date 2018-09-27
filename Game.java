public class Game{

public static void main (String [] args){

   // Creating Snake and Rabbit objects.   
   Thread snake = new Thread(new Snake(1,1));
   Thread rabbit = new Thread(new Rabbit());
   
   // Call the Rabbit's method to move.
   rabbit.start();
   // Call the snake's method to move
   snake.start();       
}
}