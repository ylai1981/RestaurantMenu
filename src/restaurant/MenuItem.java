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

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public boolean isItemIsNew() {
        return itemIsNew;
    }

    public void setItemIsNew(boolean itemIsNew) {
        this.itemIsNew = itemIsNew;
    }


}
