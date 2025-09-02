package javaClass.level1;


public class Items {
    // Arrays for multiple items
    String[] itemCode;
    String[] itemName;
    double[] price;

    // Constructor
    Items(String[] itemName, String[] itemCode, double[] price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display details of one item
    public void displayItems(int i) {
        System.out.println("Item Code: " + itemCode[i]);
        System.out.println("Item Name: " + itemName[i]);
        System.out.println("Item Price: " + price[i]);
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        String[] itemName = {"Water Bottle", "Rice", "Blackboard"};
        String[] itemCode = {"01AA", "01BB", "02AA"};
        double[] price = {500, 700, 400};

        Items itemList = new Items(itemName, itemCode, price);

        for (int i = 0; i < price.length; i++) {
            itemList.displayItems(i);
        }
    }
}
