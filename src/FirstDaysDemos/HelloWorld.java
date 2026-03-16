//public class FirstDaysDemos.HelloWorld {

/*
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
    */

import FirstDaysDemos.Pepparkaka;

    public int adder(int a, int b){
        return a+b;
    }


    void main(){
        System.out.println("Hello World java25");
        IO.println(adder(4,5));

        Pepparkaka p3 = new Pepparkaka(false, "gran");
        //FirstDaysDemos.Pepparkaka p2 = new FirstDaysDemos.Pepparkaka(true, "hjärta");

        Pepparkaka p1 = new Pepparkaka();
        p1.setForm("gris");
        Pepparkaka p2 = new Pepparkaka();
        p2.setForm("gumma");

        p1.printMe();
        p2.printMe();

    }


// }
