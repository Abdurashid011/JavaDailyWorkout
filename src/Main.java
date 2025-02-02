public class Main {

    public static void main(String[] args) {
        double goal = Console.readNumber("Kunlik kaloriya maqsadingizni kiriting (500-5000): ", 500, 5000);
        double walkingTime = Console.readNumber("Kunlik yurish vaqtini kiriting (daqilaqalarda): ", 0, 300);
        double runningTime = Console.readNumber("Kunlik yugurish vaqtini kiriting (daqiqalarda): ", 0, 300);
        double cyclingTime = Console.readNumber("Kunlik velosipedda yurish vaqtini kiriting (daqiqalarda): ", 0, 300);

        var calculator = new Calculator(walkingTime, runningTime, cyclingTime);
        double totalCaloriesBurned = calculator.calculateTotalCalories();

        var report = new Report(walkingTime, runningTime, cyclingTime, totalCaloriesBurned, goal);

        report.printActivitySummary();
        report.checkGoalAchieved();
        report.provideAdvice();
    }

}