package main.java.EmptyOptionalDateTimeAPI;
import java.util.Optional;
import java.util.OptionalInt;

import java.util.Optional;

public class StringLength {
    public static Optional<Integer> getStringLength(String input) {
        if (input == null) {
            return Optional.empty();
        }
        return Optional.of(input.length());
    }

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = null;
         Optional<Integer> IntSt1 = StringLength.getStringLength(str1);
        Optional<Integer> optionalIntSt2 = StringLength.getStringLength(str2);
        if (IntSt1.isPresent()) {
            System.out.println("Length of " + str1 + " is " + IntSt1.get());
        } else System.out.println("Empty string");

        if (optionalIntSt2.isEmpty()) {
            System.out.println("Empty string");
        }
        else System.out.println("Length of " + str1 + " is " + optionalIntSt2.get());
    }
}
