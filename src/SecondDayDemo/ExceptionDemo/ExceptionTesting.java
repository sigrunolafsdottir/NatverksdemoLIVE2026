package SecondDayDemo.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTesting {


    public void method(){


    }



    public ExceptionTesting(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try{
            i  = sc.nextInt();
            if (i==13){
                UnluckyNumberException e = new UnluckyNumberException("Inte 13!!!");
                throw e;
            }
        }
        catch(UnluckyNumberException e){
            i = 15;
            IO.println("UnluckyNumberException "+e.getMyMessage());
           // e.printStackTrace();
        }
        catch(InputMismatchException e){
            IO.println("InputMismatchException "+e.getMessage());
           // e.printStackTrace();
        }
        catch(Exception e){
            IO.println("Something went wrong, unexpected ");
           // e.printStackTrace();
        }
        IO.println(i);
    }


    static void main() {
        ExceptionTesting t = new ExceptionTesting();
    }

}
