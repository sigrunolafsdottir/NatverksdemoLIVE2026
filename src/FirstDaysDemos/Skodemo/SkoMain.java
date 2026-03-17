package FirstDaysDemos.Skodemo;

import java.util.List;

public class SkoMain {

    Skor s1 =  new Skor(37, "sandal", "svart");
    Skor s2 =  new Skor(36, "stövlar", "gröna");
    Skor s3 =  new Skor(37, "tofflor", "svart");

    List<Skor> minaSkor = List.of(
          s1, s2, s3
    );


    void main(){
        IO.println(s1);

        minaSkor.forEach(s -> IO.println(s));

        IO.println(minaSkor);


        Skor s4 =  new Skor(37, "sandal", "svart");
        Sportskor s5 =  new Sportskor(37, "gympasko", "svart", "fotoll");

        Skor s6 =  new Sportskor(37, "sandal", "svart", "golf");

        Skor s7 = (Skor) s5;



    }

}
