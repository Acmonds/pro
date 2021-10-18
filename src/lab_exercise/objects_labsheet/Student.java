package lab_exercise.objects_labsheet;

public class Student extends Person{
    private double GPA;
    public student(){
        super()

    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }

    @Override
    public String toString() {
        return "Student [GPA=" + GPA + "]";
    }
    
    
    
}
