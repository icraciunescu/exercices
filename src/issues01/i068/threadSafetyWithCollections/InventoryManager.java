package issues01.i068.threadSafetyWithCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    List<Product> soldProductsList = new CopyOnWriteArrayList<>(  );
    List<Product> purchasedProductsList = new ArrayList<>(  );

    public void populateSoldProducts() {
        for (int i = 0; i < 100; i++) {
            Product product = new Product( i, "test_product_" + i );
            soldProductsList.add( product );
            System.out.println("ADDED: " + product);
            try {
                Thread.sleep( 10 );
            } catch (InterruptedException e) {
                System.out.println("error -populateSoldProducts");
                e.printStackTrace();
            }
        }
    }

    public void displaySoldMethod() {
        for (Product prod : soldProductsList) {
            System.out.println("PRINTING THE SOLD: " + prod);
            try {
                Thread.sleep( 10 );
            } catch (InterruptedException e) {
                System.out.println("error - displaySoldMethod");
                e.printStackTrace();
            }
        }
    }

}
