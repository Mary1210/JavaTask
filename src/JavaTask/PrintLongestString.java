package JavaTask;

import java.util.Arrays;
import java.util.Comparator;

public class PrintLongestString {
    public static void main(String[] args){
        String[] cars =new String[]  {"Audi", "Volkswagen", "Mercedes", "Mazda"};
        String longestString = Arrays
                .stream(cars)
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("Longest String is "
                + longestString);
    }
}
