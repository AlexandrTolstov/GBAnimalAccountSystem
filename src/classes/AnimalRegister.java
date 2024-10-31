package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnimalRegister {
    private List<Animals> animals;

    public AnimalRegister() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(AnimalSpecies an, String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String breed){
        try {
            Date date = new Date(yearOfBirth, monthOfBirth, dayOfBirth);
            if(an == AnimalSpecies.Dog){
                animals.add(new Dog(name, date, breed));
            } else if (an == AnimalSpecies.Cat) {
                animals.add(new Cat(name, date, breed));
            } else if (an == AnimalSpecies.Hamster) {
                animals.add(new Hamster(name, date, breed));
            } else if (an == AnimalSpecies.Camel) {
                animals.add(new Camel(name, date));
            } else if (an == AnimalSpecies.Donkey) {
                animals.add(new Donkey(name, date));
            } else if (an == AnimalSpecies.Horse) {
                animals.add(new Horse(name, date));
            }
            Counter.add();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Animals animal : animals){
            stringBuilder.append(animal.toString());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
