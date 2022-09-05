package src.demoiterator;

import java.util.HashSet;

public class UseMethodsWithHashSet {
     public static void main(String[] args) {
         HashSet<Integer> number = new HashSet<>();

         // opgave b
         number.add(34);
         number.add(12);
         number.add(23);
         number.add(45);
         number.add(67);
         number.add(34);
         number.add(98);

         // opgave c
         System.out.println(number);

         // opgave d
         number.add(23);

         //opgave e
         System.out.println(number);

         //opgave f
         number.remove(67);

         // opgave g
         System.out.println(number);

         //opgave h
         System.out.println(number.contains(23));

         // opgave i
         System.out.println(number.size());





    }
}
