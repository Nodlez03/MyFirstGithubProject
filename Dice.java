package VideoTut;
import java.util.Random;
import java.util.Scanner;


public class Dice
{
	int[][][] DiceBody = { { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } },
			               { { 0, 0, 1 }, { 0, 0, 0 }, { 1, 0, 0 } },
	                       { { 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } },
			               { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } },
			               { { 1, 0, 1 }, { 0, 1, 0 }, { 1, 0, 1 } },
			               { { 1, 0, 1 }, { 1, 0, 1 }, { 1, 0, 1 } } };
			
    public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);      
	       Dice dice = new Dice();
		   while (true) {
			    int result = dice.roll();
			     System.out.println("dice face value:" + result);
			     dice.draw(result);  
			     boolean stop = false;    
			     while(!stop) {
			     System.out.println("Would you like to continue? (yes or no)");
			      String s = scanner.nextLine();
			           if(s.equals("yes")) {
			              stop = true;
			              }
			           else if (s.equals("no")) {
			              stop = false;
			              System.out.print("Thanks for playing");
			              scanner.close();
			              return;       
			              }
			        
			          }
			       }
      }
      
				
	  private void draw(int value) {
	         int[][] displayVal = DiceBody[value - 1];
			  System.out.println("-----");

			        for (int i = 0; i < 3; i++) {
			            System.out.print("|");
			            for (int j = 0; j < 3; j++) {
			                if (displayVal[i][j] == 1) {
			                    System.out.print("o");
			                } else {
			                    System.out.print(" ");
			                }
			            }
			            System.out.println("|");
			        }
		
			        System.out.println("-----");
			    }
			    private int roll() {
			        Random r = new Random();
			        return r.nextInt(6) + 1;
			    }


}
