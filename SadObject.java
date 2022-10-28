package percobaan5;

/**
 *
 * @author ACER
 */
public class SadObject extends MoodyObject{
    @Override
    protected String getMood(){
        return "sad";
    }
    @Override
    public void cry(){
        System.out.println("Hoo hoo");
 }
}