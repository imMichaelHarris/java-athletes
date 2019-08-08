package solution;

public class TrackRunnerInjector implements AthleteCreationInjector {
    @Override
    public solution.Processor getProcess(){
        return new MyApplication(new TrackRunner());
    }
}
