import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        System.out.print("Do you love java? \n Type Yes Y Not for N: ");
        ch = input.next().charAt(0);

        if(ch=='Y' || ch=='y'){
            System.out.println("You are a java Laver");
        }
        else if(ch=='N' || ch=='n'){
            System.out.println("You are Not a Java Lover");
        }
        else{
            System.out.println("Wrong input Type Yes for Y or N for N");
        }
    }
}
