public class Calculator {
    private final static int CALORIES_PER_MIN_CYCLING = 8;
    private final static int CALORIES_PER_MIN_RUNNING = 10;
    private final static int CALORIES_PER_MIN_WALKING = 5;
    private final double walkingTime;
    private final double runningTime;
    private final double cyclingTime;

    public Calculator(double walkingTime, double runningTime, double cyclingTime) {
        this.walkingTime = walkingTime;
        this.cyclingTime = cyclingTime;
        this.runningTime = runningTime;
    }

    public double calculateTotalCalories() {
        double walkingCalories = walkingTime * CALORIES_PER_MIN_WALKING;
        double runningCalories = runningTime * CALORIES_PER_MIN_RUNNING;
        double cyclingCalories = cyclingTime * CALORIES_PER_MIN_CYCLING;
        return walkingCalories + runningCalories + cyclingCalories;
    }
}
