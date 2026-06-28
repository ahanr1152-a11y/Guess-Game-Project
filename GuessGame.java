import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int secret = 7;
        System.out.print("Guess a number(1-10): ");
        int guess=sc.nextInt();
        if(guess == secret){
            System.out.println("Congratulations!You guessed correctly.");
        }else{
            System.out.println("Wrong Guess! The correct number is "+ secret);
        }
        sc.close();
    }
}
//java.util.Scanner is a predefined Java class used tot ske input from user through keybpard(or from files and other sources).without Scanner java program cannot easily accept input from keyboard.it allows user to enter value while program is running.
//import java.util.Scanner-imports the Scanner class from java.util package.
