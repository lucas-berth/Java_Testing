import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        //this is an array list that holds a collection of Fraction objects 
        ArrayList<Fraction> fractionArray = new ArrayList<Fraction>();



        Fraction f2 = new Fraction(3, 4);
        Names n1 = new Names("Fraction 2");
        f2.setName(n1);
        


        System.out.println("hello world");
        Fraction f1 = new Fraction(1,2);
        f1.display();
        System.out.println(f1.getNum());

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
        String s1 = "over there";
        String s2 = "apple";
        String s3 = "banana";

        System.out.println("Character count");
        int counta = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            counta++;
        }
        System.out.println(counta);

        System.out.println("get rid of spaces in a string");
        String temp = "";
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != ' ')
            {
                temp = temp + s1.charAt(i);
            }
        }
        System.out.println(temp);



        System.out.println("count the number of spaces");
        int count = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) == ' ')
            {
                count++;
            }
            
        }
        System.out.println(count);
        System.out.println("specificcharcount");
        char c = 'p';
        Main.specificCharCount(s2, c);




    }
    static void specificCharCount(String a, char b)
    {
        int count = 0;
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) == b)
            {
                count++;
            }
        }
        System.out.println(count);
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
