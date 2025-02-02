public class Report {

    private final double walkingTime;
    private final double runningTime;
    private final double cyclingTime;
    private final double totalCaloriesBurned;
    private final double goal;

    public Report(double walkingTime, double runningTime, double cyclingTime, double totalCaloriesBurned, double goal) {
        this.walkingTime = walkingTime;
        this.runningTime = runningTime;
        this.cyclingTime = cyclingTime;
        this.totalCaloriesBurned = totalCaloriesBurned;
        this.goal = goal;
    }

    public void printActivitySummary() {
        System.out.println("FAOLIYAT XULOSASI");
        System.out.println("--------------------------------------");
        System.out.println("Yurish vaqti: " + walkingTime + " daqiqalar");
        System.out.println("Yugurish vaqti: " + runningTime + " daqiqalar");
        System.out.println("Velosipedda yurish vaqti: " + cyclingTime + " daqiqalar");
        System.out.println("Umumiy kaloriya: " + totalCaloriesBurned + " kaloriya");
    }

    public void checkGoalAchieved() {
        System.out.println("\nFITNESS MAQSAD");
        System.out.println("-----------------------------------");
        if (totalCaloriesBurned >= goal) System.out.println("Tabrikalaymiz, siz kunlik maqsadingizga erishdingiz!");
        else
            System.out.println("Kunlik maqsadingizga erishish uchun qolgan kaloriya: " + (goal - totalCaloriesBurned) + " kaloriya");
    }

    public void provideAdvice() {
        System.out.println("\nMASLAHAT");
        System.out.println("-----------------------------------");
        if (walkingTime < 0) System.out.println("Kuniga kamida 30 daqiqa yurishingizni maslahat beramiz!");
        if (runningTime < 20) System.out.println("Kuniga kamida 20 daqiqa yugurishingizni maslahat beramiz!");
        if (cyclingTime < 30) System.out.println("Kuniga kamida 30 daqiqa velosipedda yurishingizni maslahat beramiz!");
        if (totalCaloriesBurned < 500)
            System.out.println("Kuniga kamida 300 kaloriya ishlatishingiz uchun, yurish, yugurish, velosipedda yurishingizni oshirib boring!");

    }
}
