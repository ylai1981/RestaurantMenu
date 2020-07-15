package restaurant;

public class MenuItem {
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean itemIsNew;

    public MenuItem(double itemPrice, String itemDescription, String itemCategory, boolean itemIsNew) {
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.itemIsNew = itemIsNew;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setItemIsNew(boolean itemIsNew) {
        this.itemIsNew = itemIsNew;
    }
}
