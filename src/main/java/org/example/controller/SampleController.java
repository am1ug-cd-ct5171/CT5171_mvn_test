package org.example.controller;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

  @GetMapping("/daystonewyear")
  public String daysToNewYear() {
    return "Days to new year: " + daysToNewYear(LocalDate.now()).getDays();
  }

  public Days daysToNewYear(LocalDate fromDate) {
    LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
    return Days.daysBetween(fromDate, newYear);
  }
}
