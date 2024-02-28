<b>Getting Set-Up</b>
1. Create a new repository from this template by clicking on the green Use this template button and selecting
   Create a new respository.

   <img width="501" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/884e64b4-f9bc-4680-8ead-ee2bc1ef121a">

   <img width="148" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/43dce32c-1ef1-4c83-a4d5-cc41ab092137">

 
2. On the <b>Create a new repository</b> page, select your GitHub username for the <b>Owner</b> and add in a name for your repository.

   <img width="546" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/f05e0df9-a393-441e-9c93-93407f65567c">

3. If you want to include the solution files as well, you will want to select <b>Include all branches</b>.

   <img width="421" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/3b14efda-3848-43d8-a04f-031261ad7123">


4. Then click the green <b>Create repository</b> button to create a new repository using the template repository.

5. Once the new respository is create, copy the URL to use in Visual Studio Code.

   <img width="341" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/d1be1a60-5248-41b9-95e8-140f5ee95cef">


6. In Visual Studio Code, click on the <b>Source Control</b> tab, then click <b>Clone Repository</b>.

   <img width="247" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/22a58636-7edc-4478-a759-c50dfeeaedf3">

7. Paste the respository URL into the Visual Studio search window.

   <img width="478" alt="image" src="https://github.com/clfurman/PatternMatchingSealed/assets/65421044/93d623e8-1c87-4dac-82a2-590dc8748568">

8. 

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

2. The solution to this modification can be found in <b>6-PatternMatchingSwitchStatement</b> files.

<b>Modification #6 </b>

1. We can use unnamed variables and pattern matching and to store the name instance variables for both the <code>Dog</code> and
   <code>Cat</code> objects. You can do this by changing the case statement to <code>case Dog(LicenseName name, _, _):</code>
   Since we aren't using the values of <code>breed</code> and <code>weight</code> we do not need to store them.
2. The solution to this modification can be found in <b>7-PatternMatchingSwitchStatementUnnamedVar</b> files.

<b>Extension </b>
1. Update the <code>Animal</code> interface to permit additional animals of your choice.
2. Add a record for your new animal.
3. Create additional objects of your new <code>Animal</code> type record and add them to your <code>ArrayList</code>
4. Update your switch statement to deal with your new <code>Animal</code> object, making the switch statement exhaustive. 





If you are struggling with VS code, you can add all of your code to the Java Playground here:

<java-playground id="pg1" style="display: block;">
    <snippet>
      System.out.println("Let\'s simulate a vet office.");
      // Thread.sleep(1);
      // throw new Exception("test");
    </snippet>
  </java-playground>
