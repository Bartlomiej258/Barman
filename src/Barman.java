public class Barman {

    void order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.isWithAlcohol()) {
            System.out.println(person.getName() + " no alcohol allowed");
        } else if (person.getAge() > 18) {
            System.out.println(person.getName() + " your drink is ready to drink " + drink.getName() + " cost is: " + drink.getPrice());
        }
    }
}




