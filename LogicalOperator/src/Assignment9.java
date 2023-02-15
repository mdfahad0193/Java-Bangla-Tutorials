import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("To select Bangali, Press 1");
        System.out.println("To select Hindi, Press 2");
        System.out.println("To select Urdu, Press 3");
        System.out.println("To select English, Press: Press any digit except 1,2,3");
        System.out.println("Except digit, it will be an invalid input!");

        number=input.nextInt();

        switch(number){

            case 1:
            System.out.println("Your seleted language is Banglali");
            break;
            case 2:
            System.out.println("Your seleted language is Hindi");
            break;
            case 3:
            System.out.println("Your seleted language is Urdu");
            break;
            case 4:
            System.out.println("Your seleted language is English");
            break;
            default:
            System.out.println("Not a digit");
        }


    }
}
