package jobs;

public class JobsManager {
    private int earnings;
    private String descriptionWin;
    private String nameJobs;
    private String descriptionLose;

    public JobsManager(String nameJobs, int earnings, String descriptionWin, String descriptionLose){
        this.nameJobs=nameJobs;
        this.earnings=earnings;
        this.descriptionWin=descriptionWin;
        this.descriptionLose=descriptionLose;
    }

    public String getNameJobs() {
        return nameJobs;
    }

    public String getDescriptionLose() {
        return descriptionLose;
    }

    public String getDescriptionWin() {
        return descriptionWin;
    }

    public int getEarnings() {
        return earnings;
    }
}
