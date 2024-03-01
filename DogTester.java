import java.util.*;

public class DogTester {
    public static void main (String [] args) {
        Dog d = new Dog (new LicenseName ("Brady the Blue Brindle", "Brady"), "Whippet", 46.7);
        Cat c = new Cat ("Sweetie", "Siamese", 7.5);
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(d);
        animals.add(c);

        for (Animal a: animals){
            switch (a) {
                case Dog (LicenseName n, _, _)->System.out.println(n.nickname());
                
                case Cat (String n, _, _)->System.out.println(n);
            } 
        }
    }
}

sealed interface Animal permits Dog, Cat {
}

record LicenseName (String fullName, String nickname) {
}

record Dog (LicenseName name, String Breed, double weight) implements Animal {
}

record Cat (String name, String Breed, double weight) implements Animal {
}



