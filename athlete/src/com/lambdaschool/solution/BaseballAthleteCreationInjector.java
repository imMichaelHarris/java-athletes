package src.com.lambdaschool.solution;

public class BaseballAthleteCreationInjector implements  AthleteCreationInjector{
    public Processor getProcess(){
        return new MyApp(new BaseballAthlete());
    }
}
