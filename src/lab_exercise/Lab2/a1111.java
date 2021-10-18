package lab_exercise.Lab2;

import java.util.Scanner;

public class a1111 {
    public static void main(String[] args) {
        
        Scanner keypress = new Scanner(System.in);
        

        
        
        int num1 = keypress.nextInt();
        String str1=keypress.nextLine();

        
        //keypress.close();
        if(str1==""){
            System.out.println("输入数字个数过少，请重新输入");

        }
        else{
            Scanner input =new Scanner(str1+"\n");
            int num2 =input.nextInt();
            String str =input.nextLine();
            //input.close();
            if (str==""){
                System.out.println("输入正确");
                System.out.println(num1);
                System.out.println(num2);

            }
            else{
                System.out.println("输入数字个数过多，请重新输入");
            }


        }


        
    }
    
}
