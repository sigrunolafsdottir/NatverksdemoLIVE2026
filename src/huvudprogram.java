import SecondDayDemo.Greenest.*;

import javax.swing.*;

void main() {

    List<Plant> plants = List.of(
            new Palm("Laura", 5),
            new Palm("Olle", 2),
            new Cactus("Igge", 0.2),
            new CarnivorousPlant("Meatloaf", 0.7)
    );


    while(true){
        //IO.println("vilken växt ska få mat?");
        //String input = IO.readln().trim();

        String input = JOptionPane.showInputDialog("vilken växt ska få mat?");

        for (int i = 0; i < plants.size(); i++){
            if (plants.get(i).getName().equalsIgnoreCase(input)){
                JOptionPane.showMessageDialog(null, plants.get(i).feedMe());
            }
        }

     //   Plant inputPlant =
    //            plants.stream().filter(p -> p.getName().equalsIgnoreCase(input)).findFirst().get();

    //    IO.println(inputPlant.feedMe());


    }


}