import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateEvaluation {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println(time);
        System.out.println(date);

        //formatted in a controller no methods involved
        DateTimeFormatter formatValue=DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss");
        LocalDateTime dateTimeNow=LocalDateTime.now();
        String newDateTime=dateTimeNow.format(formatValue);
        System.out.println("DateTime in Controller : "+" "+newDateTime);

        //formatted localDateTime in a method
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YY-MM-DD HH:MM:SS");
        String newTime=formattedDateTime(formatter);
        System.out.println("Local Time formatted using methods : " +" " + newTime);
    }

    public static String formattedDateTime(DateTimeFormatter formatter)
    {
        LocalDateTime currentDateTime=LocalDateTime.now();
        String formattedDateTime= currentDateTime.format(formatter);
        return  formattedDateTime;
    }
}
