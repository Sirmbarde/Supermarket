public class Product {
    public int id;
public String name;
public double buyingPrice;
public double sellingPrice;
public int weight;
public int stock;

    Product( int id, String name, double buyingPrice, double sellingPrice, int weight, int stock) {
        this.id=id;
        this.name =name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.weight = weight;
        this.stock=stock;
    }

    public void setSellingPrice (double sellingPrice) {
        this.sellingPrice=sellingPrice;

    }
    public String getName () {
        return name;
    }
    public double getBuyingPrice () {
        return buyingPrice;
    }

    public double getSellingPrice (){
        return sellingPrice;
    }
public int getWeight (){
        return weight;
}
public int getStock () {
        return stock;
}
}
