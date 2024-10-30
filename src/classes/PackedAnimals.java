package classes;

import java.util.Date;

public class PackedAnimals implements Animals {
    private String name;
    private Date birthday;
    private String command;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public String getCommand() {
        return command;
    }
}
