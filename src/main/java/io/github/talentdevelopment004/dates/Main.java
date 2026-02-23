package io.github.talentdevelopment004.dates;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws InterruptedException {
//        oldDateSystem();
        newDateSystem();


    }



    private static void newDateSystem() {
        LocalDate  date = LocalDate.now();
        System.out.println("date = " + date);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);
//        dateTime =   dateTime.plusHours(1);
//        System.out.println("dateTime after adding = " + dateTime);

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);


        dateTime = dateTime.plus(1, ChronoUnit.DECADES);
        System.out.println(dateTime);









        LocalDate todayDate = LocalDate.now();

        LocalDate tomorrowDate = todayDate.plusDays(1);

        System.out.println(todayDate.isBefore(tomorrowDate));
        System.out.println(todayDate.isAfter(tomorrowDate));


        //
        String userDate = "2001-02-02T10:10";
//        LocalDate dobDate= LocalDate.parse(userDate);
//        System.out.println("dobDate = " + dobDate);
        LocalDateTime dob = LocalDateTime.parse(userDate);

        System.out.println("dob = " + dob);
        LocalDate dobDate = LocalDate.of(1970, Month.JANUARY, 1);
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println("time zoned Date = " + ZonedDateTime.now());
        System.out.println("time zoned Date = " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("time zoned Date = " + ZonedDateTime.now(ZoneId.of("Brazil/DeNoronha")));

        Instant instant = Instant.now();
        System.out.println("instant = " + instant);

        Date oldDate = new Date();
        System.out.println("oldDate = " + oldDate);

        Instant tomorrowInstant = oldDate.toInstant().plus(1, ChronoUnit.DAYS);
        System.out.println("tomorrowInstant = " + tomorrowInstant);
        Date tomorrowOldDate = Date.from(tomorrowInstant);
        System.out.println("tomorrowOldDate = " + tomorrowOldDate);
























    }

    private static void oldDateSystem() {
        Date todayDate = new Date();
        System.out.println("todayDate = " + todayDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar current date = " + calendar.getTime());
        calendar.add(Calendar.HOUR,3);

        System.out.println(" 3 months date = " + calendar.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:Z");
        System.out.println("todayDate formatted = " + simpleDateFormat.format(todayDate));
    }
}
