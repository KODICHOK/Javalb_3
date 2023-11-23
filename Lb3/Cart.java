package Lb3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static List<Product> checkedProduct = new ArrayList<>();

    public static void addProduct(Product product) {
        checkedProduct.add(product);
    }

    public static void removeProduct(Product product) {
        checkedProduct.remove(product);
    }

    public static List<Product> getCheckedProduct() {
        return checkedProduct;
    }
}



