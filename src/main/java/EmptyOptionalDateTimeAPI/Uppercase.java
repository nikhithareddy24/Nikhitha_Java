package main.java.EmptyOptionalDateTimeAPI;
import java.util.Optional;
public class Uppercase
{

        public static Optional<String> toUpperCase(Optional<String> inputOptional) {
            if (inputOptional.isEmpty()) {
                return Optional.empty();
            }

            String input = inputOptional.get();
            String uppercaseString = input.toUpperCase();
            return Optional.of(uppercaseString);
        }

        public static void main(String[] args) {
           String str1="Java";
           String str2=null;
            Optional <String> optionalIntStrUpper1 = Uppercase.toUpperCase(Optional.of(str1));
            Optional<String> optionalIntStrUpper2 = Uppercase.toUpperCase(Optional.ofNullable(str2));
            if (optionalIntStrUpper1.isPresent()) {
                System.out.println("UpperCase of " + str1 + " is " + optionalIntStrUpper1.get());
            } else System.out.println("Empty string");

            if (optionalIntStrUpper2.isEmpty()) {
                System.out.println("Empty string");
            } else System.out.println("UpperCase of " + str2 + " is " + optionalIntStrUpper2.get());
        }
    }


