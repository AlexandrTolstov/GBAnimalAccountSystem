import classes.AnimalRegister;
import classes.AnimalSpecies;

import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Система учета для питомника");

        AnimalRegister animalRegister = new AnimalRegister();

        Scanner in = new Scanner(System.in);
        String choice = "";

        System.out.println("Выберите опции из меню ниже:\n");
        while (true) {
            System.out.println("1 - Добавить нового питомца в питомник");
            System.out.println("2 - Посмотреть кто в питомнике");
            System.out.println("3 - Выход из программы");
            System.out.println("Ваш выбор: ");
            choice = in.nextLine();
            if (choice.equals("1")) {

                //Выбор вида животного
                AnimalSpecies animalSpecies = null;
                System.out.println("Выберите вид животного: ");
                while (true) {
                    System.out.println("1 - Кот");
                    System.out.println("2 - Собака");
                    System.out.println("3 - Хомяк");
                    System.out.println("4 - Верблюд");
                    System.out.println("5 - Осел");
                    System.out.println("6 - Лошадь");

                    System.out.println("Ваш выбор: ");
                    choice = in.nextLine();
                    if (choice.equals("1")) {
                        animalSpecies = AnimalSpecies.Cat;
                    } else if (choice.equals("2")) {
                        animalSpecies = AnimalSpecies.Dog;
                    } else if (choice.equals("3")) {
                        animalSpecies = AnimalSpecies.Hamster;
                    } else if (choice.equals("4")) {
                        animalSpecies = AnimalSpecies.Camel;
                    } else if (choice.equals("5")) {
                        animalSpecies = AnimalSpecies.Donkey;
                    } else if (choice.equals("6")) {
                        animalSpecies = AnimalSpecies.Horse;
                    }

                    if (animalSpecies != null) {
                        break;
                    } else {
                        System.out.println("Не правильно выбран вид животного, попробуйте снова\n");
                    }
                }

                //Выбор имени
                String name = "";
                System.out.println("Имя животного: ");
                name = in.nextLine();

                //Ввод даты рождения
                int day;
                int month;
                int year;
                //Ввод года рождения
                System.out.println("Введите год рождения: ");
                while (true) {
                    try {
                        year = in.nextInt();
                        if (year > 1900 && year < Year.now().getValue()) {
                            break;
                        } else {
                            System.out.println("Не верно выбран диапазон года, выберите от 1900г по настоящее время");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода: " + e.getMessage());
                        System.out.println("Попробуйте заново: ");
                    }
                }
                //Выбор месяца
                System.out.println("Введите месяц рождения: ");
                while (true) {
                    try {
                        month = in.nextInt();
                        if (month > 0 && month <= 12) {
                            break;
                        } else {
                            System.out.print("Не верно выбран месяц, выберите от 1 до 12: ");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода: " + e.getMessage());
                        System.out.println("Попробуйте заново: ");
                    }
                }

                //Выбор дня
                System.out.println("Введите день рождения: ");
                while (true) {
                    try {
                        day = in.nextInt();
                        int dayInMonth = YearMonth.of(year, month).lengthOfMonth();
                        if (day > 0 && day <= dayInMonth) {
                            break;
                        } else {
                            System.out.println("Не верно выбран месяц, выберите от 1 до " + dayInMonth + "\n");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода: " + e.getMessage());
                        System.out.println("Попробуйте заново: ");
                    }
                }
                in.nextLine();

                String bread = "";
                if(animalSpecies.equals(AnimalSpecies.Cat) || animalSpecies.equals(AnimalSpecies.Dog) || animalSpecies.equals(AnimalSpecies.Hamster)){
                    //Выбор пароды
                    System.out.println("Введите пароду животного: ");
                    bread = in.nextLine();
                }

                animalRegister.addAnimal(animalSpecies, name, day, month, year, bread);


            } else if (choice.equals("2")) {
                System.out.println(animalRegister);
            } else if (choice.equals("3")) {
                break;
            } else {
                System.out.println("Не правильный ввод, Вы должны выбрать из меню:\n");
            }
        }
    }
}
