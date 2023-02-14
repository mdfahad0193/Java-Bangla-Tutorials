import java.util.Scanner;

public class ifelse {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");

        num = input.nextInt();

        if (num>0) {
            System.out.println("Prositive");
        }

        else if(num<0){
            System.out.println("Nagative");
        }
        else{
            System.out.println("Equal to Zero");
        }
        

    }
}
