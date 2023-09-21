package teckwil.com.accessmodifiers;

import teckwil.com.accessmodifiers.peopleevidence.Person;



public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        //Creeaza un obiect Person, numit ionPerson - folosind cuvintul cheie  new si constructorul cu 2 parametri
        //definit in classa Person)
        Person vasilePerson  = new Person(" Marari", 457 );
        //Proprietatea  vasilePerson.isRetired detin modificatorul public ceea ce ofera posibilitatea de_al edita din oricare loc al proiectului.
        vasilePerson.isRetired = true;

        //Proprietate isRetired este de tipul boolean si serveste drept conditie pentru instructiunea IF
        if (vasilePerson.isRetired){
            //Codul executat in cazul unei conditii adevarate
            System.out.println("Vasile este la pensie");}
        else {
            System.out.println("Vasile nu este la pensie");
            }

        System.out.println("Acesta persoana  se numeste:  " +vasilePerson.surname +"  "+ vasilePerson.isRetired );

    Person DanaM = new Person("Dana", "Morandi" , 459, 43, "moldova", false);
        if (DanaM.isRetired){
            //Codul executat in cazul unei conditii adevarate
            System.out.println( "DanaM  este la pensie");}
        else {
            System.out.println("DanaM  nu este la pensie");
        }
     Person PetreN = new Person("Petrache", 432);
             PetreN.isRetired= true;
        if (PetreN.isRetired){
            //Codul executat in cazul unei conditii adevarate
            System.out.println( "Petrica este la pensie");}
        else {
            System.out.println("Petrica  nu este la pensie");
        }
    }
}
