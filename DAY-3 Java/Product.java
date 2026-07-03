package Assignment_day_3;

public class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId, String productName, double price, int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {

        return price * quantity;
    }

    public void displayBill() {

        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Amount : " + calculateTotal());
    }
}
