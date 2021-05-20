package CodeBlock;

public class main {
    public static void main(String [] args){
        boolean gameOver = false;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000) {
            System.out.println("You scored high 5000");
            gameOver = true;
        }
        else if(score < 5000) {
            System.out.println("You scored less than 5000");
        }
        else {
            System.out.println("Got here with the game");
        }
        if (gameOver == true)
            System.out.println("level Completed!!");
        else
            System.out.println("this was executed");
    }
}
