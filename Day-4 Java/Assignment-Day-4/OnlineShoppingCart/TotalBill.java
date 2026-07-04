package OnlineShoppingCart;

public class TotalBill {
	public void calculateBill(Cart cart) {

        double total = 0;

        for (Product p : cart.products) {

            total = total + p.getPrice();
        }

        System.out.println("Total Bill = " + total);
    }

}
