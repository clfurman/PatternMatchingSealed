1. Download files and open folder in Visual Studio code.
2. Under Run Configurations add <code>--enable-preview --source 21</code> to VM Options.
3. Click <code>Run main</code> above the main method to test the code. You should see <code>Let's simulate a vet office.</code>

<b>Modification #1</b>
1. Add a <code>Dog</code> record with meaningful names for the Dog's name, breed, and weight.
2. Add a <code>Dog</code> object in the main method and print the value to the screen.

<b>Modification #2</b>

1. Add a <code>LicenseName</code> record that consists of an show name and nickname for a dog.
2. Modify the <code>Dog</code> record to include a <code>LicenseName</code>, breed, and weight.
3. Update your <code>Dog</code> object to include a <code>new LicenseName</code> with the show name and nickname of your dog. 

<b>Modification #3</b>

1. Add a <code>Cat</code> record that consists of the cat's name, breed, and weight.
2. Add a <code>Cat</code> object in the <code>main</code> method and print the value to the screen.
3. Now we want to add our animals to an <code>ArrayList</code>. In order to do this, we need an <code>Animal</code> interface.
   You can create a <code>sealed</code> interface that identifies what classes are allowed to extend it, by using
   <code>sealed interface Animal permits Dog, Cat {}</code>
4. Modify both the <code>Dog</code> and <code>Cat</code> records to implement the <code>Animal</code> interface by adding <code>implements Animal</code> after the parameter list.
5. Create an <code>ArrayList</code> of <code>Animal</code> and add your <code>Dog</code> and <code>Cat</code> objects to the list.
6. Print out your list. 

<b>Modification #4</b>

1. For each <code>Animal</code> in the list print out their name. If the animal is a <code>Dog</code> print the dog's nickname. If the animal is a <code>Cat</code> print the cat's name. 
If you are struggling with VS code, you can add all of your code to the Java Playground here:

<java-playground id="pg1" style="display: block;">
    <snippet>
      System.out.println("Let\'s simulate a vet office.");
      // Thread.sleep(1);
      // throw new Exception("test");
    </snippet>
  </java-playground>
