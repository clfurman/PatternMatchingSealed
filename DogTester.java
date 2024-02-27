import java.util.*;
public class DogTester
{
    public static void main (String [] args)
    {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        System.out.println ("Let\'s simulate a vet office.");
        Dog d = new Dog (new LicenseName("Brady the Brindle", "Brady"), "Whippet", 39.6);
        Cat c = new Cat ("Mittens", "Siamese", 8.2);
        animals.add (d);
        animals.add (c);
        System.out.println (animals);

        for (Animal a : animals)
        {
            switch (a)
            {
                //since breed and weight are not being used, we don't need to store these values
                case Dog (LicenseName name, _, _): 
                {                
                    System.out.println (name.showName());
                    break;
                }
                case Cat (String name, _, _):
                {
                    System.out.println (name);
                    break;
                }
                //since Animal is sealed, no default is needed. The only cases are Dog and Cat
            }
        }

    }
}

record Dog (LicenseName name, String breed, double weight) implements Animal{}
record Cat (String name, String breed, double weight) implements Animal{}

//sealed interface means that only Dog and Cat can implement Animal
sealed interface Animal permits Dog, Cat{}

record LicenseName (String showName, String nickName) {} 

