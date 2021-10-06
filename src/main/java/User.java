public class User {
    private String name;
    private String email;
    private String password;
    private double balance;

    User (String name, String email, String password, double balance) {
        this.name=name;
        this.email=email;
        this.password=password;
        this.balance=balance;

        // add balance
    }

public String getName (){
        return name;
}

public String getEmail () {
        return email;
}
public double getBalance (){
        return balance;
}
}
