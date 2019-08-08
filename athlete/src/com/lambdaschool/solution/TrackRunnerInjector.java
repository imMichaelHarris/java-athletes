package src.com.lambdaschool.solution;

public class TrackRunnerInjector implements AthleteCreationInjector {
    @Override
    public Processor getProcess(){
        return new MyApplication(new TrackRunner());
    }
}
