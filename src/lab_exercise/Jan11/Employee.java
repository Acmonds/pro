package lab_exercise.Jan11;

/**
 * Employee
 */
public class Employee extends Person implements Payable{
    String name,ID,department;
    double salary;
    static int amount;


    Employee(String name, String department, double salary){
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.amount++;
    }

    void editName(String name){
        this.name=name;
    }

    public static void getAmount() {
        System.out.println(amount);
        
    }

    public int calcPaymentAmount(){
        System.out.println("baaaaa");

    }


    
}