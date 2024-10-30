package classes;

import java.util.Date;

public class Pets implements Animals{
    private String name;
    private Date birthday;
    private String command;
    private String breed;

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

    public String getBreed(){
        return breed;
    }
}
