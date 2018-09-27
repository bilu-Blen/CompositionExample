package me.afua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Request the name of the parent
        System.out.println("Please enter the name of the parent");
        Scanner scan = new Scanner(System.in);
        String parentName= scan.nextLine();

        Person theParent = new Person();
        theParent.setName(parentName);

//      Adding children here (as many children as the user would like)
        Person childOne = new Person();

        System.out.println("Please enter the name of the first child");
        String firstBorn = scan.nextLine();
        childOne.setName(firstBorn);
        theParent.addAChild(childOne);

        Person childTwo = new Person();
        System.out.println("Please enter the name of the second born");
        String secondBorn = scan.nextLine();
        childTwo.setName(secondBorn);
        theParent.addAChild(childTwo);

        Person childThree = new Person();
        System.out.println("Please enter the name of the third born");
        String thirdBorn = scan.nextLine();
        childThree.setName(thirdBorn);
        theParent.addAChild(childThree);

        ArrayList <String> theirNames  = new ArrayList<>();
        for(Person eachChild: theParent.getMyChildren())
        {

            theirNames.add(eachChild.getName());
            System.out.println(theParent.getName()+"'s child is "+eachChild.getName());
        }

        Collections.sort(theirNames);
        System.out.println("Sorted Names of the children:\n");
        for(String aName:theirNames)
        {
            System.out.println(aName);
        }







    }
}
