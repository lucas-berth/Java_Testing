import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        //this is an array list that holds a collection of Fraction objects 
        ArrayList<Fraction> fractionArray = new ArrayList<Fraction>();







        System.out.println("hello world");
        Fraction f1 = new Fraction(1,2);
        f1.display();

        //this adds the new instance to the ArrayList
        fractionArray.add(f1);



        System.out.println("hello 2");
        
        String[] ar = {"balls", "cats", "bats", "dogs"};
       
       
       workingWithStrings(ar[1]);
       printreverse(ar[3]);
    
        System.out.println (ar[0]);

        String a = "apple";
        String b = "apple";
        System.out.println(a.toUpperCase());
        if(a == b)
        {
            System.out.println("correct!!!");
        }
    }

    static void workingWithStrings(String name)
    {
        System.out.println(name);
    }

    static void printreverse(String name1)
    {
        for(int i = name1.length() - 1; i >= 0; i--)
        {
            System.out.println(name1.charAt(i));
        }
    }


}
