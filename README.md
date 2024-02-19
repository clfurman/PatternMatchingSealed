1. Download the <b>main</b> branch files and open folder in Visual Studio code.
2. Under Run Configurations add <code>--enable-preview --source 21</code> to VM Options.
3. Click <code>Run main</code> above the main method to test the code. You should see <code>Let's simulate a vet office.</code>

<b>Modification #1</b>
1. Add a <code>Dog</code> record with meaningful names for the Dog's name, breed, and weight.
2. Add a <code>Dog</code> object in the main method and print the value to the screen.
3. The solution to this modification can be found in <b>2-SimpleDogRecord</b> files.

<b>Modification #2</b>

1. Add a <code>LicenseName</code> record that consists of an show name and nickname for a dog.
2. Modify the <code>Dog</code> record to include a <code>LicenseName</code>, breed, and weight.
3. Update your <code>Dog</code> object to include a <code>new LicenseName</code> with the show name
   and nickname of your dog.
4. The solution to this modification can be found in <b>3-LicenseRecord</b> files.

<b>Modification #3</b>

1. Add a <code>Cat</code> record that consists of the cat's name, breed, and weight.
2. Add a <code>Cat</code> object in the <code>main</code> method and print the value to the screen.
3. Now we want to add our animals to an <code>ArrayList</code>. In order to do this, we need an <code>Animal</code> interface.
   You can create a <code>sealed</code> interface that identifies what classes are allowed to extend it, by using
   <code>sealed interface Animal permits Dog, Cat {}</code>
4. Modify both the <code>Dog</code> and <code>Cat</code> records to implement the <code>Animal</code> interface by adding <code>implements Animal</code>
   after the parameter list.
6. Create an <code>ArrayList</code> of <code>Animal</code> and add your <code>Dog</code> and <code>Cat</code> objects to the list.
7. Print out your list.
8. The solution to this modification can be found in <b>4-AnimalInterface</b> files.

<b>Modification #4</b>

1. For each <code>Animal</code> in the list print out their name. If the animal is a <code>Dog</code> print the dog's show
   name. If the animal is a <code>Cat</code> print the cat's name. Your code may look similar to this:

   <img width="454" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/19e3cfa1-6f7f-46fd-96a5-da70a6d93bfc">

3. Update your code to use pattern matching with <code>instanceof</code> combine the test, declaration, and typecasting into one statement.
   Here is the code modification to update the check for the <code>Dog</code> objects:

   <img width="425" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/d764f731-b9b2-4935-a6d6-d160ab191d24">

   Update your code to check for <code>Cat</code> using pattern matching.

4. The solution to this modification can be found in <b>5-PatternMatchingIfStatement</b> files.

<b>Modification #5</b>
1. Consider a list with many different types of animals beyond just <code>Dog</code> and <code>Cat</code>.
   We could continue our <code>if</code> branching, but a better way would be to use a <code>switch</code> statement instead.
   Because we created <code>Animal</code> as a <code>sealed interface</code> we do not need to include a
   <code>default</code> branch to our <code>switch</code> statement. Your code might look similar to the following:

   <img width="484" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/4fdb1368-5e9b-4b96-ac32-059327a5f536">

2. Use unnamed variables and pattern matching and to store the name instance variables for both the <code>Dog</code> and
   <code>Cat</code> objects. You can do this by changing the case statement to <code>case Dog(LicenseName name, _, _):</code>
   Since we aren't using the values of <code>breed</code> and <code>weight</code> we do not need to store them.
3. The solution to this modification can be found in <b>6-PatternMatchingSwitchStatement</b> files.





If you are struggling with VS code, you can add all of your code to the Java Playground here:

<java-playground id="pg1" style="display: block;">
    <snippet>
      System.out.println("Let\'s simulate a vet office.");
      // Thread.sleep(1);
      // throw new Exception("test");
    </snippet>
  </java-playground>
