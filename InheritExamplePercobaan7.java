package percobaan7;

/**
 *
 * @author ACER
 */
class Bapak {
    int a =1;
    int b=1;
    public void show_variabel(){
        System.out.println("NIlai a="+ a);
        System.out.println("NIlai b="+ b);
 }
}
 class Anak extends Bapak{
    int c;
    public void show_Variabel(){
        System.out.println("NIlai a="+ super.a);
        System.out.println("NIlai b="+ super.b);
        System.out.println("NIlai c="+ c);
 }
}
public class InheritExamplePercobaan7 {
    public static void main(String[] args) {
        Bapak objectBapak = new Bapak();
        Anak objectAnak = new Anak();
        
        System.out.println("Object Bapak (Superclass):");
        objectBapak.show_variabel();
        
        objectAnak.c=5;
        System.out.println("Object Anak (Superclass dari Bapak):");
        objectAnak.show_Variabel();
 }
}