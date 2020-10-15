
public class Test {
    public static void main(String[] args) {

        Person person = new Person("Karolina", "Mazur", 16);
        Person person1 = new Person("Rafał", "Nowak", 25);
        Drink drink = new Drink("Mojito", 30, true);
        Drink drink1 = new Drink("Old Fashioned", 50, false);
        Barman barman = new Barman();

        barman.order(person, drink);
        barman.order(person1, drink1);
        barman.order(person, drink1);
        barman.order(person1, drink);


    }

}