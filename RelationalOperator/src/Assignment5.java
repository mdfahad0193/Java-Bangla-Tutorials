import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int voterAge;
        System.out.print("Enter Your age: ");
        voterAge = input.nextInt();

        if(voterAge>=18){
            System.out.println("Valid votre");
        }
        else{
            System.out.println("Invalid voter");
        }
 
    }
}
