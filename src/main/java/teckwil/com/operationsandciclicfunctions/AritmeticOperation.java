package teckwil.com.operationsandciclicfunctions;

public class AritmeticOperation{
    public static void main(String[] args) {
    int a = 43;
    int c = 3;

    // Sum
        int sum = a + c;
        System.out.println("Suma " + sum);
        System.out.println("Suma " + (a+c));
    // substraction
    int  sub = a-c;
        System.out.println("Rezultat: " + sub);
    //Multiplication
        int result =  a * c;
        System.out.println("Inmultirea: " +  result);
    //Devision
        result= a/c;
        System.out.println("Impartirea: " + result);

    //The rest of devision or Devision with remainder
    result = a % c;
        System.out.println("restul ramas dupa impartire: " + result);
    }
}
