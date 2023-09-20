package teckwil.com.classesandobjects;

import teckwil.com.classesandobjects.autoservicetask.Car;
import teckwil.com.classesandobjects.autoservicetask.Garage;
import teckwil.com.classesandobjects.autoservicetask.Person;
import teckwil.com.classesandobjects.autoservicetask.Worker;

public class ManageAutoservice {
    public static void main(String[] args) {
        Garage autoDoc;

        autoDoc = new Garage();
        autoDoc.address = "Stefan Ursu, E192";
        autoDoc.surfaceM2 = 59;
        autoDoc.capacity = 17;
        System.out.println("Obiectul autoDoc are urmatoarele proprietati: " + autoDoc.address
                + " " + autoDoc.surfaceM2 +"m2 " + " " + autoDoc.capacity+" masini");
        Worker vasile = new Worker();

        vasile.name = "Vasile";
        vasile.age = 54;
        System.out.println("Obiectul nostru are numele de " + vasile.name + " si are " +vasile.age+ "ani");

        Person client1 = new Person("37379898989898");
        Car porscheNNk132 = new Car("AMyefugegu54646", "cayenne",client1);

        Car mercedezBenz = new Car("Benfj7890", "mercedes", new Person("37360073297"));


        System.out.println("Masina noastra este "  + porscheNNk132.mark + " " +
                "Si proprietarul poate fi apelat la  " + porscheNNk132.owner.phoneNumber);
    }
}
