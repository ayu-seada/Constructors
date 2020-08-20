package Ayu.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Car porsche = new Car();
    Car holden = new Car();
   // porsche.model = "carrera";
        Scanner myObj = new Scanner(System.in);
        System.out.println("@Enter Model@");
        String myModel = myObj.nextLine();
         porsche.setModel(myModel);
            System.out.println("@Model is " + porsche.getModel());


    }
}
