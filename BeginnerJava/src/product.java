import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //numberinput
        System.out.print("id: ");
        int id = input.nextInt();

        //stringinpur
        System.out.print("title: ");
        String title = input.nextLine();
        System.out.print("price: ");
        String price = input.nextLine();
        System.out.print("discription: ");
        String discription = input.nextLine();
        System.out.print("category: ");
        String category = input.nextLine();

        //output
        System.out.print("Product id: "+id);
        System.out.print("Product title: "+title);
        System.out.print("Product price: "+price);
        System.out.print("Product discription: "+discription);
        System.out.print("Product category: "+category);


    }
}
