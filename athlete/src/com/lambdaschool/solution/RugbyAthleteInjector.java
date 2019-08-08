package src.com.lambdaschool.solution;

public class RugbyAthleteInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess() {
        return new MyApp(new RugbyAthlete());
    }
}
