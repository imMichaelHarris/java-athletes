package src.com.lambdaschool.solution;

public class HockeyGoalieInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess(){
        return new MyApp(new HockeyGoalie());
    }

}
