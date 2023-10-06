package teckwil.com.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputlength){
        return inputlength.length();
    }
    public static int getThetextLengthWithTryCatchFinally(String inputlength){
        try{
            return  inputlength.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An exception has been captured with the following message. " + capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed no matter what. ");
        }
    }
    public static int getTheTextLengthIfElse(String inputlength) {
        if (inputlength == null) {
            System.out.println("input string is a null value, be carefull!");
            return 0;
        } else {
            return inputlength.length();
        }
    }
}
