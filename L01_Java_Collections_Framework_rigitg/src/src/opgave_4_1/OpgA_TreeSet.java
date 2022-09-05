package src.opgave_4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class OpgA_TreeSet {
    public static void main(String[] args) {
        System.out.println("User Directory = " + System.getProperty("user.dir"));
        TreeSet<String> treeSet = new TreeSet<>();
        int count = 0;
        File f = new File("L01-JaveCollectionsFramework/src/ex4/Gjoengehoevdingen.txt");
        try (Scanner scanner = new Scanner(f)) {
//            scanner.useDelimiter("[^A-ZÆØÅa-zæøå'-]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                count++;
                treeSet.add(word.toLowerCase());
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! An unexpected error has occurred.");
            System.out.println("Technical message: " + ex.getMessage());
        }
//        System.out.println(treeSet);
        for(String word : treeSet) {
            System.out.println(word);
        }
        System.out.println(treeSet.size());
        System.out.println(count);
    }
}
