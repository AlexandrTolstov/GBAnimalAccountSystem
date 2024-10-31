package classes;

import java.util.Date;

public class PackedAnimals extends Animals {

    public PackedAnimals(String name, Date birthday) {
        super(name, birthday);

        this.animalClass = "Вьючные животные";
    }
}
