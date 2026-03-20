import SecondDayDemo.PartyAnimal;
import SecondDayDemo.Person;
import SecondDayDemo.Student;

void main(){


    Student s = new Student("Mimmi", "543543", "Nätverksprogrammering");
    Person p = new Person("Nisse", "45364");

    PartyAnimal pa = new Student("Hicke", "54645654", "DBTek");

    IO.println(s.getFavoriteSnack());
    IO.println(p.getFavoriteSnack());
    IO.println(pa.getFavoriteSnack());

}