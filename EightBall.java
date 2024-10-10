import java.util.Random;
import java.util.Scanner;

public class EightBall {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your question: ");
        scan.next();
        scan.close();

        Random rand = new Random();
        int r = rand.nextInt(6); //generates random number between 0-5
        System.out.println(r);

        if(r == 0){
            System.out.println("As I see it, yes.");
        }else if(r == 1){
            System.out.println("Signs point to yes.");
        }else if(r == 2){
            System.out.println("Reply hazy, try again.");
        }else if(r == 3){
            System.out.println("Signs point to yes.");
        }else if(r == 4){
            System.out.println("Definitely!");
        }else if(r == 5){
            System.out.println("Of course, it is just a matter of time.");
        }
        
        
        
        
        
        


    }
}
