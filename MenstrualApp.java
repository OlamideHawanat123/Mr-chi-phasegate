package PhaseGateApps;

public class MenstrualApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first date of your last period: ");
        String startDate = scanner.nextLine();

        System.out.print("Enter the last date of your last period: ");
        String endDate = scanner.nextLine();

        System.out.print("Enter your cycle length: ");
        int cycleDays = scanner.nextInt();

        System.out.print("Enter your period duration: ");
        int periodDuration = scanner.nextInt();

        System.out.print("Enter your shortest cycle length: ");
        int shortestCycle = scanner.nextInt();

        MyMenstrualApp input = new MyMenstrualApp(startDate, endDate, cycleDays, periodDuration, shortestCycle);

        System.out.println("Your next period starts on:" + input.nextFlowStartingDate());
        System.out.println("Your next period ends on:" + input.nextFlowEndingDate());

        System.out.println("Your next ovulation starts on:" + input.nextOvulation());
        System.out.println("Your fertile day begins on:" + input.startingOfFertileDay());

        System.out.println("Your fertile date ends on:" + input.endingOfFertileDays());
        System.out.println("Your safe period begins on:" + input.beginningOfSafePeriods());
        System.out.println("Your safe period ends on:" + input.endingOfSafePeriods());
    }
}
