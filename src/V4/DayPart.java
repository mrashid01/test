package V4;


import java.time.LocalTime;

enum PartOFDay {MORNING, AFTERNOON, EVENING, NIGHT}
public class DayPart {
    private PartOFDay dp;

    public DayPart(LocalTime lt) {
        int hour = lt.getHour();
        if (hour > 5 && hour < 12){
            dp = PartOFDay.MORNING;
        }
        else if (hour >= 12 && hour < 17){
            dp = PartOFDay.AFTERNOON;
        }
        else if (hour >= 17 && hour < 22){
            dp = PartOFDay.EVENING;
        }
        else {
            dp = PartOFDay.NIGHT;
        }
    }
    public DayPart(){
        this(LocalTime.now());
    }
    public PartOFDay getDayPart(){
        return dp;
    }
    @Override
    public String toString(){
        switch (dp){
            case MORNING:
                return "morning";
            case AFTERNOON:
                return "afternoon";
            case EVENING:
                return "evening";
            case NIGHT:
                return "night";
            default:
                return "unknown";
        }
    }

}
