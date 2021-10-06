import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    //Product product = new Product ();
    Supermarket supermarket = new Supermarket();

    public static void main(String[] args) {
        Main main = new Main();

        main.showMenu();
    }


    void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("\nWelcome to the supermarket application, please select account: ");
            System.out.println("1. Sales representative");
            System.out.println("2. Buyer");
            System.out.println("3. Owner");
            //System.out.println("1. Add Product");
            // add menu User, Buyer, sales representative


            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit", "QUIT", "quit":
                    System.out.println("Exiting Application...");
                    break;
                case "1":
                    salesRepresentative();
                case "2":
                    buyer();
                    break;
                case "3":
                    owner();
                    break;

                default:
                    break;
            }
        }
        while (!userInput.equalsIgnoreCase("Quit"));
    }

    void salesRepresentative() {
        System.out.println("Please log in in the application");
        System.out.println("Please enter user name");
        String name = scanner.nextLine();
        System.out.println("Please enter password");
        String password = scanner.nextLine();

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("\nWelcome to the supermarket application, please select an activity: ");
            System.out.println("1. Add product");
            System.out.println("2. View all products");

            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit", "QUIT", "quit":
                    System.out.println("Exiting Application...");
                    break;
                case "1":
                    addProducts();
                case "2":
                    viewProducts();
                    break;

                default:
                    break;
            }
        }
        while (!userInput.equalsIgnoreCase("Quit"));
        return;
    }

    void addProducts() {
        System.out.println("Add a product.");
        System.out.println("Please provide product id:");
        int productId=scanner.nextInt();

        System.out.println("Please provide product name:");
        String productName = scanner.nextLine();

        System.out.println("Please provide buying price:");
        double buyingPrice = scanner.nextDouble();

        System.out.println("Please provide selling price:");
        double sellingPrice = scanner.nextDouble();

        System.out.println("Please provide weight:");
        int weight = intScanner.nextInt();

        System.out.println("Please provide stock:");
        int stock = intScanner.nextInt();

        Product product = new Product(productId, productName, buyingPrice, sellingPrice, weight, stock);
        supermarket.addProduct(product);
        System.out.println("Product added succesfully");
    }

    void viewProducts() {
        ArrayList<Product> allProducts = supermarket.getAllProducts();

        System.out.println("\nAll Available Products\n");
        System.out.println(" =Name\t bying price\t buying price\t selling price\t weight\t stock");
        for (Product product : allProducts) {
            System.out.println(product.name + " \t" + product.buyingPrice + " \t" + product.sellingPrice + "\t" + product.weight + "\t" + product.stock);
        }
    }

    void buyer() {
        System.out.println("Select product you want to buy");
        System.out.println("1.Please enter product name");
        String productName = scanner.nextLine();
        System.out.println("2. Please enter an amount you want to buy");
        int amount = intScanner.nextInt();
        //if (amount<addProducts()){
        //   System.out.println("Sorry, there is not enough stock");
    }

    void owner() {
        System.out.println("Please select an acitivty:");
        System.out.println("1. Add user");
        System.out.println("2. View sales report");
        System.out.println("3. View balance");

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println("Choose a number:");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Quit", "QUIT", "quit":
                    System.out.println("Exiting Application...");
                    break;
                case "1":
                    addUser();
                    //   case "2":
                    //       viewSales();
                    //       break;
                    //    case "3":
                    //       viewBalance();
                    //       break;

                default:
                    break;
            }
        }
        while (!userInput.equalsIgnoreCase("Quit"));
        return;
    }

    void addUser() {
        System.out.println("Please provide name");
        String userName = scanner.nextLine();

        System.out.println("Please provide email:");
        String userEmail = scanner.nextLine();

        System.out.println("Please provide password:");
        String userPassword = scanner.nextLine();

        System.out.println("Please provide balance:");
        double userBalance = scanner.nextDouble();

        User user = new User (userName, userEmail, userPassword, userBalance);
        supermarket.addUser(user);
        System.out.println("User added succesfully");
    }
}



