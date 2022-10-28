package percobaan8;

/**
 *
 * @author ACER
 */
public class Parent {
    String parentName;
    public Parent() {}

    public String getParentName() {
        return parentName;
    }public Parent(String parentName){
        this.parentName = parentName;
        System.out.println("Konstruktor parent");
 }

    }