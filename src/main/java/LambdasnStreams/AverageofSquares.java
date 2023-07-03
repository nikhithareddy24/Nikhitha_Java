package main.java.LambdasnStreams;
import java.util.Arrays;
import java.util.List;

public class AverageofSquares
{ public static void main(String args[])
        {
            List<Integer> num = Arrays.asList(6,5,2,8,1,7);
            double avg = num.stream()
                    .filter(n->n%2==1)
                    .map(n->n*n)
                    .mapToInt(n->n)
                    .average()
                    .getAsDouble();
            System.out.println(avg);

        }
    }

