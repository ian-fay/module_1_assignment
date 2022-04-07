package edu.wctc;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    Scanner keyboard;
    String typeBeingUsed;
    ArrayList<Talkable> zoo;
    //        In your project, create a class that does the following:
    //
    //        1.Ask the user what type of animal they want to create
    //        2.Accept the input(s) necessary to instantiate that type of object
    //        3.Create an object of that type
    //        4.Add the object to the ArrayList
    //        Hint: Pass the list to the user input-gathering object.

    public Input(ArrayList<Talkable> zoo) {
        this.keyboard = new Scanner(System.in);
        this.zoo = zoo;
    }

    public String createNewCreature() {
        String inputType;
        String inputName;
        int inputInt;
        boolean inputBoolean;
        int checkForNumber;
        String output = "";

            System.out.println("What type of animal do you want to create?");
            inputType = keyboard.nextLine().toLowerCase();

            System.out.println("What is the name of your chosen creature?:");
            inputName = keyboard.nextLine();

            switch(inputType) {
                case "cat":
                    System.out.println("How many mice has this cat killed?");
                    inputInt = keyboard.nextInt();
                    Cat cat = new Cat(inputInt, inputName);
                    zoo.add(cat);
                    break;
                case "dog":
                    System.out.println("Is this dog friendly? (true or false)");
                    inputBoolean = keyboard.nextBoolean();
                    Dog dog = new Dog(inputBoolean, inputName);
                    zoo.add(dog);
                    break;
                case "teacher":
                    System.out.println("How old is this teacher?");
                    inputInt = keyboard.nextInt();
                    Teacher teacher = new Teacher(inputInt, inputName);
                    zoo.add(teacher);
                    break;
                default:
                    System.out.println("That is not an accepted animal type, please choose a correct type.");
                    output = "";
            }
        return output;
    }

}
