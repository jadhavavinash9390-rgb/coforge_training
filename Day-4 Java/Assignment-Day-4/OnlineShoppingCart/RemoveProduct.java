package OnlineShoppingCart;

public class RemoveProduct {
	public void removeProduct(Cart cart, int id) {

        for (int i = 0; i < cart.products.size(); i++) {

            if (cart.products.get(i).getProductId() == id) {

                System.out.println(cart.products.get(i).getProductName() + " Removed Successfully.");

                cart.products.remove(i);

                return;
            }
        }

        System.out.println("Product Not Found.");
    }

}
