//Name:kamlesh Rani
//Student ID: 201908158
//Date Submitted: March 19 2021
//Class IN2203 Section Number : G1
//Name of work: Assignment 1: The gambling Game
import java.lang.Math;
import java.util.*;

public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
    
        Scanner in= new Scanner(System.in);
        public void OrganizeNewGame(){
            System.out.println("Hello! Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= in.nextLine();
        
        if(userAnswer.equals("y")){
           
            System.out.println("let's get started" );
                    g1.PlayGame();
                    p1.GameAlgo();
}
else
{System.out.println("Good bye!");}
}
}
class Game{
    Random rand= new Random();
    int ComputerGuess= rand.nextInt(100) ;
    
    public void PlayGame(){
        System.out.println("Guess a number from 1 to 100");
        System.out.println("If your guess is within 10 of my guesses: then you win . Else i will Win ");
        ComputerGuess= ComputerGuess();
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = rand.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
   
    Game obj= new Game();
    
    public void GameAlgo()
    {
        Scanner scan= new Scanner(System.in);
        int k= 5;// it is the number of trials
        int playerNum;
        int i;
        for( i=1 ; i<= k;i++)
        {
            System.out.println("Your number ? ");
            playerNum= scan.nextInt();
            
            if(Math.abs(playerNum - obj.ComputerGuess)< 10 )
            {System.out.println("Yaay! , its the right guess.");
                System.out.println("Number = " + obj.ComputerGuess );
            break;}
            
            else 
            {
                System.out.println("Sorry, Try again ");
            }
            if(i==k)
            {
                System.out.println("No more Trials, Computer Wins ");
                System.out.println("The number is"+ ComputerGuess);
            }
            
        }
        
        
    }
    
}
        

