import java.util.*;

public class DogTester {
    public static void main (String [] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        System.out.println ("Let\'s simulate a vet office.");
        Dog d = new Dog (new LicenseName("Brady the Brindle", "Brady"), "Whippet", 39.6);
        Cat c = new Cat ("Mittens", "Siamese", 8.2);
        animals.add (d);
        animals.add (c);
        System.out.println (animals);

        for (Animal a : animals) {
            switch (a) {
                //uses pattern matching to declare dog and assign it to (Dog)a
                case Dog dog: {                
                    System.out.println (dog.name().showName());
                    break;
                }
                case Cat cat: {
                    System.out.println (cat.name());
                    break;
                }
                //since Animal is sealed, no default is needed. The only cases are Dog and Cat
            }
        }
    }
}

//sealed interface means that only Dog and Cat can implement Animal
sealed interface Animal permits Dog, Cat {
}

record LicenseName (String showName, String nickName) {
} 

record Dog (LicenseName name, String breed, double weight) implements Animal {
}

record Cat (String name, String breed, double weight) implements Animal {
}




