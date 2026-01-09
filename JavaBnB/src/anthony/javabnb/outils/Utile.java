package anthony.javabnb.outils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Utile {

    private Utile(){

    }

    public static Date createDate(int jour, int mois, int annee){
        return new GregorianCalendar(annee, mois - 1, jour).getTime();
    }

    public static String formaterDate(Date date){
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }

    public static String formaterDate(Date date, String format){
        return new SimpleDateFormat(format).format(date);
    }
}
