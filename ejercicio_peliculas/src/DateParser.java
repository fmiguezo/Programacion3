import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateParser {
    public static Date parse(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
