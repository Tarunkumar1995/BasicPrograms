public class CustomExceptions {
    public static void main(String[] args)  {
        Age aa= new Age();

        try {
            aa.validate(5);
        } catch (AgeNotLessThanException e) {
            System.out.println(e.getMessage() );
        }


    }
}

class Age{
    public void validate(int number) throws AgeNotLessThanException{
        if(number < 10){
            throw new AgeNotLessThanException("Age Should be Greater than 10", new RuntimeException());
        }
    }
}
