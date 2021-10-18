package example_sheet1;

public class Ex8 {
    public static String validate(){
        return "Request validated";
    }
    public static void answer(String name){
        System.out.println("\n" + name+"has subbmitted a request: "+validate());

    }
    public static void main(String[] args) {
    	answer("Agnes");
        
    }
}
