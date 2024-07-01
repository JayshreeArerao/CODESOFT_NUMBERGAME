import java.util.Scanner;
class NumberGame 
{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
        int Chances=8;
        int finals=0;
        boolean playAgain=true;
        System.out.println("Welcome Buddy!");
        System.out.println("Hey Buddy you have about "+Chances+" to win the game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean  guess =false;
            for(int i=0;i<Chances;i++){
                System.out.println("chance"+(i+1)+" Enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess =true;
                    finals+=1;
                    System.out.println("you won it.");
                    break;
                }
                else if(user>rand ){
                    System.out.println("Tool High");
                }
                else{
                    System.out.println("Tool Low");
                }
            }
            if(guess ==false){
                System.out.println("S0rry Buddy.You lost the chances. the number is"+rand);
            }
            System.out.println("Do you want to paly Again(y/n");
            String PA=sc.next();
            playAgain=PA.equalsIgnoreCase("y");
        }
        System.out.println("that is it Buddy,Hope you enjoyed it");
        System.out.println("Here is your score"+finals);
    }
        public static int getrandN(int min,int max){
            return(int)(Math.random()*(max-min+1)+min);
        }
    
}
/*
output :

Welcome Buddy!
Hey Buddy you have about 8 to win the game
chance1 Enter your guess:
87
Tool High
chance2 Enter your guess:
46
Tool Low
chance3 Enter your guess:
23
Tool Low
chance4 Enter your guess:
12
Tool Low
chance5 Enter your guess:
10
Tool Low
chance6 Enter your guess:
5
Tool Low
chance7 Enter your guess:
99
Tool High
chance8 Enter your guess:
2
Tool Low
S0rry Buddy.You lost the chances. the number is63
Do you want to paly Again(y/n
*/
