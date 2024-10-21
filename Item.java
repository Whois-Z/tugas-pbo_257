public class Item {
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemStock;

    // Konstruktor default
    public Item() {}

    public Item(String name, String code) {
        this.itemName = name;
        this.itemCode = code;
    }

    public Item(double price, String code, String name) {
        this.itemPrice = price;
        this.itemCode = code;
        this.itemName = name;
    }

    // Manajemen stok
    public int updateStock(int stockUpdate) {
        this.itemStock += stockUpdate;
        return itemStock;
    }

    // Metode getter
    public double getPrice() {
        return itemPrice;
    }

    public String getCode() {
        return itemCode;
    }

    public String getName() {
        return itemName;
    }

    public int getStock() {
        return itemStock;
    }
}
