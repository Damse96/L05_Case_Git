package src.opgave_1;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        System.out.println(persons);
        System.out.println();
        //opgave 1.a

        Person p44 = findFirst(persons, p -> p.getAge() == 44);
        System.out.println("Age 44 " + p44);
        System.out.println();

        //opgave 1.b
        Person pS = findFirst(persons, p ->  p.getName().startsWith("S"));
        System.out.println("find den første person der starter med S  " + pS);
        System.out.println();

        //opgave 1.c
        Person pI = findFirst(persons,p -> p.getName().indexOf("i") != p.getName().lastIndexOf("i"));
        System.out.println("find den første person der har to i'er i deres navn  " + pI);
        System.out.println();

        //opgave 1.d
        Person pW = findFirst(persons,p -> p.getAge() == p.getName().length());
        System.out.println("find den første person med alder og navn som er lige lange  " + pW);
        System.out.println();

        //opgave e
        List<Person> list1 = findAll(persons, p -> p.getAge() < 30);
        System.out.println("alle under 30" + list1);
        System.out.println();

        //opgave f
        List<Person> listI = findAll(persons,p -> p.getName().contains("i"));
        System.out.println("find alle personer som har et i i deres navn  " + listI);
        System.out.println();

        //opgave g
        List<Person> listSS = findAll(persons,p -> p.getName().startsWith("S"));
        System.out.println("find alle personer som starter med S  " + listSS);
        System.out.println();

        //opgave h
        List<Person> list5 = findAll(persons, p -> p.getName().length() == 5);
        System.out.println("find folk med navn der er på 5 bogstaver  " + list5);
        System.out.println();

        //opgave i
        List<Person> list6 = findAll(persons,p -> p.getName().length() >= 6 && p.getAge() < 40);
        System.out.println("find folk " + list6);
        System.out.println();

    }

        /**
         * Returns from the list the first person
         * that satisfies the predicate.
         * Returns null, if no person satisfies the predicate.
         */



        public static Person findFirst (List < Person > list, Predicate < Person > filter){
            for (Person p : list) {
                if (filter.test(p))
                    return p;
            }
            return null;
        }

        public static List<Person> findAll(List < Person > list, Predicate < Person > filter){
            List<Person> personList = new ArrayList<>();
            for (Person p : list){
                if (filter.test(p))
                    personList.add(p);
            }
            return personList;
        }
    }

