package percobaan2;

/**
 *
 * @author ACER
 */
public class Percobaan2{
public class Pegawai{
    String nama;
    public double Gajian;
}

public class Manajer extends Pegawai{
    public String departemen;
    
    public void IsiData(String n, String d) {
        nama=n;
        departemen=d;
    }
}
    }