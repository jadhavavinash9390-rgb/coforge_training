package OnlineShoppingCart;

public class ShoppingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(101, "Shiva");

        Cart cart = new Cart();

        AddProduct add = new AddProduct();
        RemoveProduct remove = new RemoveProduct();
        TotalBill bill = new TotalBill();

        System.out.println("Customer Name : " + customer.getCustomerName());

        add.addProduct(cart, new Product(1, "Laptop", 50000));
        add.addProduct(cart, new Product(2, "Mouse", 500));
        add.addProduct(cart, new Product(3, "Keyboard", 1500));

        System.out.println();

        bill.calculateBill(cart);

        System.out.println();

        remove.removeProduct(cart, 2);

        System.out.println();

        bill.calculateBill(cart);
    }

	

}
