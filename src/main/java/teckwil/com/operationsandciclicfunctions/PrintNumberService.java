package teckwil.com.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 500;
        int limit = 400;
        while (a > 0){
            System.out.println(a+ " ,");
              a = a -1;
              a -=1;
            a--;
        }
        //Valoarea lui a dupa ce iese din ciclul while este 0
        System.out.println();
        do{
            System.out.println( a + ", ");
               a = a + 1;
            a++;
        } while (a < limit);
        System.out.println();
        for (int i = 1; i <= limit; i++){
            if ((i % 2 ) == 0){
                System.out.println(i + ", ");
            } else {
                System.out.println("[], ");
            }
        }
    }
}
