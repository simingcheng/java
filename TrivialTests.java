import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.*;

public class TrivialTests {

    public static void main(String args[]) {
        double d = 123.4999;
        System.out.println(String.format("%.7f", d));
        DecimalFormat floatFormat = new DecimalFormat(".#######");
        floatFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.println(floatFormat.format(d));

        int v1 = 123;
        long v2 = 0x3367l;
        double v3 = 0.334634;
        System.out.println(String.format(Locale.ITALY, "%d\t%d\t%.2f", v1, v2, v3));

        final Locale prevLocale = Locale.getDefault();
        Locale locale = new Locale("th", "TH", "TH");
        Locale.setDefault(locale);
        String header = String.format("%d;lat=%.7f;lon=%.7f;src=G", 123231L,
                12.331, 87.654);
        System.out.println(header);
        Locale.setDefault(prevLocale);

        /*
        Locale list[] = SimpleDateFormat.getAvailableLocales();
        Set set = new TreeSet();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i].getDisplayName() 
                    +"\t\t\t:\t"+ list[i].toString());
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() );
        }
        */
    }
}
