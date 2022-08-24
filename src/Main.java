import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedHashMap<DayOfWeek,Integer> days = new LinkedHashMap<>();
        days.put(DayOfWeek.MONDAY,0);
        days.put(DayOfWeek.TUESDAY,0);
        days.put(DayOfWeek.WEDNESDAY,0);
        days.put(DayOfWeek.THURSDAY,0);
        days.put(DayOfWeek.FRIDAY,0);
        days.put(DayOfWeek.SATURDAY,0);
        days.put(DayOfWeek.SUNDAY,0);



        for (int i=0;i<100;i++){
            LocalDate date = LocalDate.ofYearDay(2022, random.nextInt(365)+1);
            days.put(date.getDayOfWeek(),days.get(date.getDayOfWeek())+1);
            System.out.println("Выбран: "+date+", это "+date.getDayOfWeek().name()+" + 1.");

        }
        System.out.println(days);
    }
}
