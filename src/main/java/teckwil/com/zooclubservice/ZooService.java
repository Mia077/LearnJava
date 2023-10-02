package teckwil.com.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        //Mai jos se aplica polimorfismul  pentru a declara un obiect de tip Animal insa a il crea cu constructorul clasei copil Dog.
        Cat kitty = new Cat("Markiza");
        AbstractAnimal dog = new Dog("Djoni");
        //Metoda makeSound() ce apartine obiectului Dog nu poate fi apelata deoarece dog e de tip AbstractAnimal iar
        //makeSound() este declarata in Interfata , pu a fixa acest lucru ar trebui ca interfata sa fie implementata
        // de catre clasa abstracta AbstractAnimal
       dog.eat();

       kitty.makeSound();
       kitty.eat();
    }
}
