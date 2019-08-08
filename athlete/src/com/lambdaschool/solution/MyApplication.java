package src.com.lambdaschool.solution;

public class MyApplication implements Processor {
    private AthleteCreation myAthlete;

    public MyApplication(AthleteCreation myAthlete) {
        this.myAthlete = myAthlete;
    }

    @Override
    public void displayAthlete() {
        myAthlete.displayAthlete();
    }
}
