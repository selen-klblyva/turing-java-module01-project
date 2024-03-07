package Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeApp {
  public static void main(String[] args) {
      System.out.println(LocalDate.now());
      System.out.println(System.currentTimeMillis());
      System.out.println(LocalDate.ofEpochDay(0));
      System.out.println(LocalDate.MAX);
      System.out.println(LocalDate.MIN);
      System.out.println(ZoneId.of("UTC+04"));

      System.out.println(LocalTime.now());
      System.out.println(LocalTime.now().plusMinutes(15));
      System.out.println(LocalDateTime.now());
      LocalDateTime parsedDateTime=LocalDateTime.parse("2024-03-04T20:11");
      System.out.println(parsedDateTime);
      System.out.println(parsedDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
      System.out.println(parsedDateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
      System.out.println(parsedDateTime.format(DateTimeFormatter.ofPattern("dd+++MM---yyyy===HH::mm;;ss")));

      LocalDate date=LocalDate.of(2024,2,27);
      System.out.println(date);
      System.out.println(date.plusDays(2));


  }

}
