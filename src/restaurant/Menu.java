package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date dateModified;
    private ArrayList<MenuItem> menuItems;

    public Menu(Date dateModified, ArrayList<MenuItem> menuItems) {
        this.dateModified = dateModified;
        this.menuItems = menuItems;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
