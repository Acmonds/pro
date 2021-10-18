package lab_exercise.Lab2;

public class myEx {
    private int numberOfPies;
    private int numberOfPeople;
    private int eachOfPie;
    private int leftOfPie;

    
    


    public myEx() {
    }


    public myEx(int numberOfPies, int numberOfPeople) {
        this.numberOfPies = numberOfPies;
        this.numberOfPeople = numberOfPeople;
    }


    public int getEachOfPie() {
        return eachOfPie;
    }


    public int getLeftOfPie() {
        return leftOfPie;
    }


    public void caculate(){
        

        this.eachOfPie=numberOfPies/numberOfPeople;
        this.leftOfPie=numberOfPies%numberOfPeople;
        
        

    }


    
}
