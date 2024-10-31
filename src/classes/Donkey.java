package classes;

import java.util.Date;

public class Donkey extends PackedAnimals{
    public Donkey(String name, Date birthday) {
        super(name, birthday);

        animalSpecies = "Осел";

        commands.add(Commands.Lie);
        commands.add(Commands.Eat);
        commands.add(Commands.BowDown);
        commands.add(Commands.Chew);
        commands.add(Commands.Sit);
        commands.add(Commands.Drag);
    }
}
