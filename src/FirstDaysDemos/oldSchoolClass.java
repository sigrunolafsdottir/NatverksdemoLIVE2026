package FirstDaysDemos;

public class oldSchoolClass {

    public int subst(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World oldschool");
        oldSchoolClass c = new oldSchoolClass();
        int answer = c.subst(7,4);
        System.out.println(answer);
    }

}
