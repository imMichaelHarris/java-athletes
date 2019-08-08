package src.com.lambdaschool.solution;

public class HockeyAthleteCreationInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess(){
        return new MyApp(new HockeyGoalie());
    }

}
