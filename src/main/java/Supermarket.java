import java.util.ArrayList;

public class Supermarket {
    public ArrayList<Product> product;
    private ArrayList<User> users;
    private static int totalProductsSold = 0;

    // to view all product list
    Supermarket() {

        product = new ArrayList<>();
        users = new ArrayList<>();
        totalProductsSold = 0;
    }

    public ArrayList<Product> getProducts() {
        return product;
    }


    // add product
    public String addProduct(Product product) {this.product.add(product);
        return product.name + "Added successfully";
    }

    // add user
    public String addUser(User users) {
        this.users.add(users);
        return users.getName() + "Added successfully";
    }

    public int getTotalProductsSold() {
        return getTotalProductsSold();
    }

    public static void updateTotalProductsSold(int productsSold) {
        totalProductsSold += productsSold;
    }

    public ArrayList<Product> getAllProducts() {
        return product;
    }
}
