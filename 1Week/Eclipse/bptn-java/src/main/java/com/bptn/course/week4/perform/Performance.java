package com.bptn.course.week4.perform;
// create an array list of strings
import java.util.*;

interface testInterface {
    void abstractMethod() ;

//    int abstractMethod(int num) {
//        return num;
//    }

    default void defaultMethod() {
        System.out.print("Hey this is a default method");
    }
}

class MyNewClass implements testInterface {
    @Override
    public void abstractMethod() {
        System.out.println("This method is overridden");
    }

    public int abstractMethod(int num) {
        System.out.println("This method is overridden");
        return num * 2 ;
    }
}


public class Performance  {
    public static void main(String[] args) {

        MyNewClass myNewClass = new MyNewClass();
        myNewClass.abstractMethod(2) ;

        List<String> lst = new ArrayList<>();
        lst.add("mike");
        lst.add("cathie");
        lst.add("errol");
        lst.add("greg");
        lst.add("eric");
        lst.add("barbara");
        lst.add("umra");
        lst.add("ashley");
        lst.add("jessica");
        lst.add("errol");
        lst.add("mike");

//        Set<String> unique = new HashSet<>(lst);

//        unique.forEach(System.out::println);
        List<String> lstNew = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
//           System.out.println(lst.get(i).compareTo("g") );
           if (lst.get(i).compareTo("g") > 0) {
               lstNew.add(lst.get(i));
           }
        }
        lstNew.forEach(System.out::println);


    }
}
