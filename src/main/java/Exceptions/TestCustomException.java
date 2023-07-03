package main.java.Exceptions;


    class InvalidAgeException  extends RuntimeException
    {
        public InvalidAgeException (String str)
        {
            super(str);
        }
    }
    public class TestCustomException
    {
        static void validate (int age) throws InvalidAgeException{
            if(age < 18){
                throw new InvalidAgeException("age is not valid to vote");
            }
            else {
                System.out.println("welcome to vote");
            }
        }
        public static void main(String args[])
        {
            try
            {

                validate(13);
            }
            catch (InvalidAgeException ex)
            {

                System.out.println("Exception occured: " + ex);
            }
            finally
            {
                System.out.println("Executing something");
            }
        }
    }

