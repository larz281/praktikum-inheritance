package percobaan5;

/**
 *
 * @author ACER
 */
public class HappyObject extends MoodyObject{
    @Override
    protected String getMood(){
        return"happy";
    }
    @Override
    public void laugh(){
        System.out.println("Hahaha");
 }
}