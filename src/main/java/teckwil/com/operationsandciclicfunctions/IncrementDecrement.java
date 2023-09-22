package teckwil.com.operationsandciclicfunctions;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        // Incrementare
        a++;
        System.out.println("Valoarea dupa incrementare: " + a );

        //Incrementare pre-fixata
        ++a;
        //a = 7
        int b = ++a;
        // b = 8, a = 8;
        int a1 = a;
        int c = a++;
        //c = 8; a = 9;
        System.out.println("Valoarea dupa incrementarea pre_fixata: " + a);
        System.out.println("Afiseaza b = " + b + " a1 = "+ a1 + " c = " + c + " a2 = " +a);
        //Decrementare
        a--;
        System.out.println("Valoarea dupa decrementare: " + a);
        //Decrementare pre-fixata
        --a;
        System.out.println("Valoarea dupa decrementarea prefixata: " + a);
    }
}
