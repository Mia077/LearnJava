package teckwil.com.zooclubservice;

public class Cat extends AbstractAnimal implements AnimalInterface {

    //Definim un constructor pentru a crea obiecte de tipul Cat cu parametrul formal de tip String Name
    public Cat (String name) {
        // Cuvantul cheie super este folosit pentru apelul constructorului clasei parinte, care are nevoie de aceasta proprietate
        super(name);
    }
     //makesound() este o metoda declarata in AnimalInterface respectiv trebuie implementata, ea fiind abstracta acolo
    @Override
    public void makeSound(){
        System.out.println("Cat " +getName() + " says: Meow!");
    }
    //eat() este o metoda declarata in clasa in clasa abstracta Animal respectiv trebuie implementata , ea find abstracta acolo.
    @Override
    public void eat(){
        //metoda getName este concreta si implementata in clasa Parinte Abstract Animal. Acesta poate fi declarata si Protected acolo.
        System.out.println(getName() + " is eating fish.");
    }
}
