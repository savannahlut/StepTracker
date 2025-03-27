public class StepTracker{
    final int minSteps;
    int totalSteps;
    int activeDays;
    int totalDays;

    public StepTracker(int minSteps){
        this.minSteps = minSteps;
        totalSteps = 0;
        activeDays = 0; 
        totalDays = 0;
    }

    public int activeDays(){
        return activeDays;
    }

    public void addDailySteps(int steps){
        if(steps > minSteps){
            activeDays++;
        }
        totalSteps += steps;
        totalDays++;
    } 

    public double averageSteps(){
        if(totalSteps = 0) return 0; 
        return (totalSteps / totalDays);
    }
}