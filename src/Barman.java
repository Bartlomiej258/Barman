public class Barman {

    void order(Person person, Drink drink) {
        if (person.getAge() < 18 && drink.withAlkohol()) {
            System.out.println(person.getName() + " no alcohol allowed");
        } else if (person.getAge() < 18 && drink.withAlkohol() == false){
            System.out.println(person.getName() + " your drink is ready to drink cost is: " + drink.getPrice());
        }
        else if (person.getAge() > 18) {
            System.out.println(person.getName() + " your drink is ready to drink " + " cost is : " + drink.getPrice());
        }
    }

    }




