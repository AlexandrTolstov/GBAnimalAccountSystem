package classes;

import java.util.Date;

public class Horse extends PackedAnimals{
    public Horse(String name, Date birthday) {
        super(name, birthday);

        animalSpecies = "Лошадь";

        commands.add(Commands.Lie);
        commands.add(Commands.Eat);
        commands.add(Commands.BowDown);
        commands.add(Commands.Chew);
        commands.add(Commands.Galloping);
    }
}
