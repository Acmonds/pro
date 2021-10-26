package lab_exercise.Exceptions_and_FileIO;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        boolean succeed = true;
        while (succeed == true) {

            Scanner a = new Scanner(System.in);
            String inPut = a.nextLine();
            a.close();
            try {
                Scanner b = new Scanner(inPut);
                int num = b.nextInt();
                b.close();
                System.out.println(num);
                succeed=false;
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }

    }

}
