public class AgeNotLessThanException extends Exception{

    public AgeNotLessThanException() {}
    public AgeNotLessThanException(String message){
        super(message);
    }

    public AgeNotLessThanException(String message, Throwable cause){
        super(message,cause);
    }

}
