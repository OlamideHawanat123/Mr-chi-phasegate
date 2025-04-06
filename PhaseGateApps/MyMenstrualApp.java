package MyCollections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyMenstrualApp {

    private final String startDate;
    private final String endDate;
    private final int cycleDays;
    private final int periodDuration;
    private final int shortestCycle;
    private final int longestCycle;

    public MyMenstrualApp(String startDate, String endDate, int cycleDays, int periodDuration, int shortestCycle, int longestCycle) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.cycleDays = cycleDays;
        this.periodDuration = periodDuration;
        this.shortestCycle = shortestCycle;
        this.longestCycle = longestCycle;

    }
    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String nextFlowStartingDate() {
        LocalDate periodStartTime = LocalDate.parse(startDate, date);
        LocalDate periodEndTime = LocalDate.parse(endDate, date);

        LocalDate nextFlowStartDate = periodStartTime.plusDays(cycleDays);

        return nextFlowStartDate.format(date);
    }

    public String nextFlowEndingDate() {
        LocalDate periodEndTime = LocalDate.parse(nextFlowStartingDate(), date);
        LocalDate nextFlowEndDate = periodEndTime.plusDays(periodDuration);

        return nextFlowEndDate.format(date);
    }

    public String nextOvulation() {
        LocalDate periodStartTime = LocalDate.parse(startDate, date);
        LocalDate nextOvulation = periodStartTime.plusDays(cycleDays / 2);
        return nextOvulation.format(date);

    }



    public String startingOfFertileDay() {

        LocalDate periodStartDates = LocalDate.parse(startDate, date);
        LocalDate beginningOfFertileDate = periodStartDates.plusDays(shortestCycle-18);
        return beginningOfFertileDate.format(date);
    }


    public String endingOfFertileDays() {

        LocalDate periodStartDates = LocalDate.parse(startDate, date);
        LocalDate endingOfFertileDate = periodStartDates.plusDays((shortestCycle-18)+6);
        return endingOfFertileDate.format(date);
    }

    public String beginningOfSafePeriods() {
    LocalDate nextFlowStartingDate = LocalDate.parse(nextFlowStartingDate(), date);
    LocalDate beginningOfSafePeriod = nextFlowStartingDate.plusDays(shortestCycle - 18);

    return beginningOfSafePeriod.format(date);

    }


    public String endingOfSafePeriods() {
        LocalDate beginningOfSafePeriods = LocalDate.parse(beginningOfSafePeriods(), date);
        LocalDate endingOfSafePeriod = beginningOfSafePeriods.plusDays(6);
        return endingOfSafePeriod.format(date);
    }
}


