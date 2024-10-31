package classes;

import java.util.Date;
import java.util.List;

public class Camel extends PackedAnimals{

    public Camel(String name, Date birthday) {
        super(name, birthday);

        animalSpecies = "Верблюд";

        commands.add(Commands.Lie);
        commands.add(Commands.Eat);
        commands.add(Commands.BowDown);
        commands.add(Commands.Chew);
        commands.add(Commands.Sit);
    }
}
