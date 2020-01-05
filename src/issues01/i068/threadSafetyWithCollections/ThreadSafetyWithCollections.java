package issues01.i068.threadSafetyWithCollections;

public class ThreadSafetyWithCollections {

    public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();

        Thread inventoryTask = new Thread( new Runnable() {
            @Override
            public void run() {
                inventoryManager.populateSoldProducts();
            }
        } );

        Thread displayTask = new Thread( new Runnable() {
            @Override
            public void run() {
                inventoryManager.displaySoldMethod();
            }
        } );

        inventoryTask.start();
        try {
            Thread.sleep( 500 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        displayTask.start();

    }

}
