package opgave_4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OpgC_LinkedHashMap {
    public static void main(String[] args) {
//        System.out.println("User Directory = " + System.getProperty("user.dir"));
        LinkedHashMap<Integer, TreeSet<String>> linkedHashMap = new LinkedHashMap<>();
        File f = new File("L01-JaveCollectionsFramework/src/ex4/Gjoengehoevdingen.txt");
        try (Scanner scanner = new Scanner(f)) {
            scanner.useDelimiter("[^A-ZÆØÅa-zæøå]+");
            while (scanner.hasNext()) {
                String word = scanner.next();
                int hashCode = word.hashCode();
                if(linkedHashMap.get(hashCode) != null) {
                    TreeSet<String> s = linkedHashMap.get(hashCode);
                    s.add(word);
                    linkedHashMap.put(hashCode,s);
//                    linkedHashMap.merge(hashCode,word,(val1, val2) -> val1.addAll(val2));
                } else {
                    TreeSet<String> s = new TreeSet<>();
                    s.add(word);
                    linkedHashMap.put(hashCode, s);
                }
                
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Sorry! An unexpected error has occurred.");
            System.out.println("Technical message: " + ex.getMessage());
        }
        for(Map.Entry<Integer,TreeSet<String>> e : linkedHashMap.entrySet()) {
            if(e.getValue().size() > 1) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
//        System.out.println(linkedHashMap.size());
//        System.out.println(count);
    }
}
