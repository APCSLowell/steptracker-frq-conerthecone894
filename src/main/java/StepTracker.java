import java.util.ArrayList;
public class StepTracker
{
 private int days, active;
    private ArrayList<Integer> steps = new ArrayList<Integer>();

    public StepTracker(int a){
         active = a;
    }

    public void addDailySteps(int s){
        steps.add(s);
        days++;
    }

    public int activeDays(){
        int aDays = 0;

        if(steps.size() != 0){
            for(int i = 0; i < steps.size(); i++){
                if(steps.get(i) >= active)
                    aDays++;
            }
        }

        return aDays;
    }

    public double averageSteps(){
        int s = 0;
        int d = 0;

        for(int i = 0; i < steps.size(); i++){
            s += steps.get(i);
            d++;
        }

        return s/d;
    }
} 
