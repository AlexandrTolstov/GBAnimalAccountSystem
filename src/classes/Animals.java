package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Animals {
    protected String animalSpecies;
    protected String animalClass;
    protected String name;
    protected Date birthday;
    protected List<Commands> commands;

    public Animals(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
        this.commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAnimalSpecies(){
        return animalSpecies;
    }

    public String getAnimalClass(){
        return  animalClass;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getListOfCommands() {
        return commands.toString();
    }

    @Override
    public String toString() {

        return String.format("[Вид: %s; Класс животного: %s; Имя: %s; Дата рождение: %tD; Список команд: %s]",
                animalSpecies, animalClass, name, birthday, getListOfCommands());
    }
}
