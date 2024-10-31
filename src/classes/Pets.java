package classes;

import java.util.Date;

public class Pets extends Animals{

    private String breed;

    public Pets(String name, Date birthday, String breed) {
        super(name, birthday);
        this.breed = breed;
        this.animalClass = "Домашние животные";
    }

    public String getBreed(){
        return breed;
    }

    @Override
    public String toString() {
        String str = super.toString();
        return str.substring(0, str.length() - 1) + "; Порода: " + breed + " ]";
    }
}
