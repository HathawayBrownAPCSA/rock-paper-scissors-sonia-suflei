
/**
 * Write a description of class RPSMatch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rpsMatch
{
    // instance variables - replace the example below with your own

    public int humanWins;
    public int computerWins;
    public int ties;
    public String humanPlay;
    public String computerPlay;
    public int rps;
    public int cheat;
    
    
   public void setHumanPlay(String man)
   {
        humanPlay = man;
   }
    
   public String getComputerPlay()
   {
       rps = (int)(Math.random()* 3);
       cheat = (int)(Math.random()*3);
       if (cheat >= 1)
       {
           if (rps == 0)
           {
               computerPlay = "rock";
               return "Rock";
           }
           else if (rps == 1)
           {
               computerPlay = "scissors";
               return "Scissors";
           }
           else
           {
               computerPlay = "paper";
               return "Paper";
           }
        }
        else
        {
            if (humanPlay.equals("scissors"))
            {
                computerPlay = "rock";
                return "rock";
            }
            else if (humanPlay.equals("rock"))
            {
                computerPlay = "paper";
                return "paper";
            }
            else
            {
                computerPlay = "scissors";
                return "scissors";
            }
        }
   }
   
   public String getResult()
   {
           if (humanPlay.equals(computerPlay))
            {
                ties ++;
                return "It's a tie! :O";
            }
            else
            {
                if (humanPlay.equals("scissors") && computerPlay.equals("rock"))
                {
                    computerWins ++;
                    return "Computer Wins";
                }
                else if (humanPlay.equals("scissors") && computerPlay.equals("paper"))
                {
                    humanWins ++;
                    return "Human Wins";
                }
                else if (humanPlay.equals("paper") && computerPlay.equals("rock"))
                {
                    humanWins ++;
                    return "Human Wins";
                }
                else if (humanPlay.equals("paper") && computerPlay.equals("scissors"))
                {
                    computerWins ++;
                    return "Computer Wins";
                }
                else if (humanPlay.equals("rock") && computerPlay.equals("scissors"))
                {
                    humanWins ++;
                    return "Human Wins";
                }
                else if (humanPlay.equals("rock") && computerPlay.equals("paper"))
                {
                    computerWins ++;
                    return "Computer Wins";
                }
                else
                {
                    computerWins ++;
                    return "idk";
                }
            
        }
   }
   
   public int getHumanWins()
   {
       return humanWins;
   }
   
   public int getComputerWins()
   {
       return computerWins;
   }
   
   public int getTies()
   {
       return ties;
   }
   
   public int getCheat()
   {
       return cheat;
   }

    
}
