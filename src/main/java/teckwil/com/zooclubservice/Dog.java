package teckwil.com.zooclubservice;

public class Dog extends AbstractAnimal implements AnimalInterface {
    //Definim un constructor pentru a crea obiecte de tipul Dog cu parametrul  formal de tip String Name.
    public Dog(String name){
        //Cuvantul cheie super este folosit  pentru apelul constructorului clasei parinte, care are nevoie de aceasta proprietate.
        super(name);
    }
    //makesound() este o metoda declarata  in AnimalInterface respectiv trebuie implementata, ea fiind abstracta acolo
    @Override
    public void makeSound() {
        System.out.println("Dog " + getName()+ " says : Woof!");
    }
    //eat() este o metoda declarata in clasa abstracta Animal respectiv trebuie implementata , ea fiind abstracta acolo
    @Override
    public void eat() {
        //metoda getName este concreta si implementata in clasa parinte Animal.
        //Aceasta poate fi declarata si Protected acolo.
        System.out.println(getName() + " is eating bones.");
    }
}
