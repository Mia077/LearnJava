package teckwil.com.classesandobjects.autoservicetask;

import java.sql.SQLOutput;

public class Car {

    public String vinCode;
    public String mark;
    public Person owner;

    //definim metoda cu acelasi nume doar cu parametri ca metoda sa nu primeasca null

    public Car(String vinCodeInput, String mark, Person owner){
        vinCode = vinCodeInput;
        this.mark = mark;
        this.owner = owner;
        System.out.println("Now there is a car in the service." + mark);
    }
}
