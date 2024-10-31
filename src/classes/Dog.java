package classes;

import java.util.Date;

public class Dog extends Pets{
    public Dog(String name, Date birthday, String breed) {
        super(name, birthday, breed);

        animalSpecies = "Собака";

        commands.add(Commands.Lie);
        commands.add(Commands.Eat);
        commands.add(Commands.Jump);
        commands.add(Commands.Run);
        commands.add(Commands.Sit);
        commands.add(Commands.Turn);
    }
}
