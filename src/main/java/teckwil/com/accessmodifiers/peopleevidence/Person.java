package teckwil.com.accessmodifiers.peopleevidence;

public class Person {
    private String name;
    // Proprietatile Private pot fi apelate si folosite doar in interiorul clasei
    //Daca vom avea Person ionPerson, atunci ionPerson.name nu va putea fi accesat.
    public String surname;
    private final long Id;
    //Proprietatea Final reprezinta o costantanta, asta inseamna ca ea nu se va schiba in timp,
    //prin urmare trebuie ca fiecare obiect initializat sa aiba   un ID, acesta fiind inclus in Constructor
    int age;
    protected String residence;
    //Informatia  despre pensie nu e atat de importanta , daca consideram ca avem un obiect Person numit ionPerson
    //atunci ionPerson.isRetired ar fi o expresie acceptata in orice clasa a proiectului. {public} - ofera acces din oricare punct al proiectlui.
    public boolean isRetired;

    public Person(){

        Id = 0;
    }
    //Costructorul de mai jos va permite crearea obiectelor Person care dispun de surname si id. Celelalte  proprietati vor fi nule innitial
    //astfel ar trebui sa folosim numeObiect.numeProprietate = valoarea, pentru a le popula ulterior.
    public Person(String surname, long id){
        this.surname = surname;
        Id =id;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 2 parametri.");
    }
    //Constructorul de mai jos accepta o serie de variabile locale si le foloseste pu a popula toate proprietatile unui nou obiect.
    public Person(String name, String surname, int id, int age, String residence, boolean isRetired){
        this.name = name;
        this.surname = surname;
        Id = id;
        this.age = age;
        this.residence = residence;
        this.isRetired = isRetired;
        System.out.println("Un obiect de tip person a fost creat, folosind un constructor cu 5 parametri formali. ");
    }
}
