package src.com.lambdaschool.solution;

public class BaseballAthleteInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApp(new BaseballAthlete());
    }
}
