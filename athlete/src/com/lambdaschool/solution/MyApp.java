package src.com.lambdaschool.solution;

public class MyApp implements Processor {
    private AthleteCreation myAthlete;

    public MyApp(AthleteCreation myAthlete) {
        this.myAthlete = myAthlete;
    }

    @Override
    public void displayAthlete() {
        myAthlete.displayAthlete();
    }
}
