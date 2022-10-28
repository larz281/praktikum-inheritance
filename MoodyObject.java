package percobaan5;

/**
 *
 * @author ACER
 */
public class MoodyObject {
    protected String getMood(){
        return "moody";
    }
    public void speak(){
        System.out.println("I am : "+getMood());
    }
    public void laugh() {
        System.out.println("Hahaha : " + getMood());
    }
    public void cry(){
        System.out.println("hoo hoo : "+ getMood());
    }
}