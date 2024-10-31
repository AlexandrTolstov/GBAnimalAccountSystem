package classes;

import java.util.Date;

public class Hamster extends Pets{
    public Hamster(String name, Date birthday, String breed) {
        super(name, birthday, breed);

        animalSpecies = "Хомяк";

        commands.add(Commands.Lie);
        commands.add(Commands.Eat);
        commands.add(Commands.Run);
        commands.add(Commands.Turn);
        commands.add(Commands.RunInAWheel);
    }
}
