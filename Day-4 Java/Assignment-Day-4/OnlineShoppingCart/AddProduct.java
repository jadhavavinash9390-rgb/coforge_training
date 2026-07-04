package OnlineShoppingCart;

public class AddProduct {
	public void addProduct(Cart cart, Product product) {

        cart.products.add(product);

        System.out.println(product.getProductName() + " Added Successfully.");
    }

}
