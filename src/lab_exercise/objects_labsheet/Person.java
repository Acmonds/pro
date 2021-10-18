package lab_exercise.objects_labsheet;

public class Person {
    private String sex;
    private int age;
    private String name;

    public Person(String sex,int age, String name) {
        if (sex=="male"||sex=="female"){
            this.sex = sex;
        }
        this.age=age;
        this.name=name;
    }

    public String getSex() {
        return sex;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
    }
    


    
    
}
