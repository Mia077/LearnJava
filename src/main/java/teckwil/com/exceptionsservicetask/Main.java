package teckwil.com.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
        String controlVariable = null;

        System.out.println("the sting Length it is = " + TextManager.getTheTextLengthIfElse("Deonis"));
        System.out.println("The String Length it is =" + TextManager.getThetextLengthWithTryCatchFinally(controlVariable) );
        System.out.println("Lungimea este =  "+TextManager.getTheTextLengthIfElse(controlVariable));


        System.out.println(ArithmeticOperationService.divideIntNoExceptionHandling(0,4));
        System.out.println(ArithmeticOperationService.devideIntWithExceptionHandling(0, 0));
        System.out.println("The show must go on: " );

    }

}
