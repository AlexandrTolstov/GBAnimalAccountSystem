package classes;

import java.util.Date;

public class Cat extends Pets{

    public Cat(String name, Date birthday, String breed) {
        super(name, birthday, breed);

        animalSpecies = "Кот";

        commands.add(Commands.Lie);
        commands.add(Commands.Eat);
        commands.add(Commands.Jump);
        commands.add(Commands.Run);
        commands.add(Commands.Sit);
    }
}
