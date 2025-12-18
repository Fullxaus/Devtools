package ru.mentee.power.devtools.taskreview;

import java.util.Arrays;

public class TaskString {

    public String [] cat={"Tom","Billy","Mimi"};
    public String[] dog={"Rex","Bob","Tom"};


    public String[]animals(String[]cat,String[]dog){

        String[]animal=new String[cat.length+dog.length];

        for (int i = 0; i < cat.length ; i++) {
            animal[i]=cat[i];
        }
        for (int i = 0; i < dog.length ; i++) {
            animal[i+ cat.length]=dog[i];
        }
        return animal;
    }

    public  void animalsEquals(String[] animals){
        boolean animalEquals = false;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].equals("Tom")) {
                System.out.println(animals[i] + " found at index " + i);
                animalEquals = true;
            }
        }
        if (!animalEquals) {
            System.out.println("No animals with name 'Tom' found");
        }
    }

    public static void main(String[] args) {

        TaskString taskString=new TaskString();

        String[]animals= taskString.animals(taskString.cat, taskString.dog);
        System.out.println(Arrays.toString(animals));
        taskString.animalsEquals(animals);



    }
}
