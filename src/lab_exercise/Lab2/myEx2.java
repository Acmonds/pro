package lab_exercise.Lab2;



public class myEx2 {
    public static String change() {
        String name = "dawdawda";
        double age =1234567890.2121;
        String line =String.format ("%15s %-15.5f",name,age);
        return line;

        
    }
    public static void main(String[] args) {
        System.out.println(change());
    }
    
    
}
