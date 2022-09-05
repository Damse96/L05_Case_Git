package src.opgave_4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class OpgB_TreeMap {
    public static void main(String[] args) {
        System.out.println("User Directory = " + System.getProperty("user.dir"));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        int count = 0;
        File f = new File("L01-JaveCollectionsFramework/src/ex4/Gjoengehoevdingen.txt");
        try (Scanner scanner = new Scanner(f)) {
            scanner.useDelimiter("[^A-ZÆØÅa-zæøå'-]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                int iCount;
                if(treeMap.get(word) != null) {
                    iCount = treeMap.get(word);
                    iCount++;
                } else {
                    iCount = 1;
                }
                count++;

                treeMap.put(word, iCount);
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! An unexpected error has occurred.");
            System.out.println("Technical message: " + ex.getMessage());
        }
        for(Map.Entry<String,Integer> e : treeMap.entrySet()) {
            if(e.getValue() > 1000) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
        System.out.println(treeMap.size());
        System.out.println(count);
    }
}
