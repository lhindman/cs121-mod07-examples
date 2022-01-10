# CS121 - Module 7 - Arrays Guided Experimentation
The purpose of this guided experimentation is to provide students with an opportunity to experiment with the code examples presented in the lecture. It is important to keep detailed observation notes as you work through the experiments below. These observations will be useful to you as you complete the labs and you will be allowed to reference them on open book / open note quizzes. You will not be required to turn in your observations.
## Getting Started
To get started on this activity, please clone this repository into your development environment  

Steps to Clone Examples
1. Copy the URL for this repo by clicking the green "Code" button above, select HTTPS then click the copy icon.
2. Open VSCode, click the Source Control icon then click Clone Repository.
3. Pasted the repo URL into the "Provide repository URL" field and press Enter
4. Browse to the location in your development environment where you want to store the repostory and click Select Repository Location.
5. When prompted, Open the repository then Open the workspace

## Arrays of Objects Experimentation 
1. Open *Grade.java* and *GradeRange.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - This example code has been modified to better demonstrate the power of Arrays of Objects. An initializer list is used to populate the grades[] with objects. when you run the program note the order that that the grade objects are displayed in the console.  Record your observations.
    - Review the code for the Grade class. Notice that it implements the Comparable<Grade> interfaces, which means it provides a compareTo() method designed to compare two Grade objects. When we have an array of Comparable objects, we can use the static methods provided in the Collection class to sort our array. Append the following code to the end of the main() method in GradeRange. You will need to import java.util.Arrays. What is the result and why?
    ```
        Arrays.sort(grades);
	
        System.out.print("\n*\n* Sorted in ascending order\n*\n");
        for (Grade letterGrade : grades)
           System.out.println(letterGrade);
    ```
    - Modify the compareTo() method in Grade.java as shown below.  What is the result and why?
    ```
        public int compareTo(Grade arg0) {
            return  arg0.lowerBound - this.lowerBound;
        }
    ```
	

## Arrays and Methods Experimentation
In the deeper look videos, we discussed that when a class *implements* an interface they are guaranteeing that objects created from that class provide certain methods. Java check for this at compile time, but also provides the ***instanceof*** operator so that we can also check at runtime. Let's have some fun. :)
1. Open *Die.java* and *GameOfDice.java*, read the code and run it to ensure it functions properly. Also study the contents of the interface defined in Rollable.java. Then work through each of the experiments below and record your observations.
    - Modify the main() method in GameOfDice.java to confirm at runtime that the Die object is Rollable as shown below. Are die1 and die2 in fact instances of the Rollable interface?
    ```
	Die die1 = new Die();
	if ( (die1 instanceof Rollable) == false) {
	    System.out.println("Error: Object is not Rollable");
	    System.exit(1);
	}

	Die die2 = new Die(64);
	if ( (die2 instanceof Rollable) == false) {
	    System.out.println("Error: Object is not Rollable");
	    System.exit(1);
	}
    ```
    
    - In addition to the Rollable interface, the Die class also implements the Comparable interface. Add the following code to the main() method of GameOfDice.java to check if the Die object is Comparable.
    ```
	if ( (die1 instanceof Comparable) == false) {
	    System.out.println("Error: Object is not Comparable");
	    System.exit(1);
	}

	if ( (die2 instanceof Comparable) == false) {
	    System.out.println("Error: Object is not Comparable");
	    System.exit(1);
	}
    ```
 
    - Modify the Die class as shown below so that it no longer implements the Rollable interface and run the program. What is the result? The Die class still has a roll() method. Is that sufficient for it to be an instance of the Rollable or must it explicitly state that it implements the Rollable interface?
    ```
	public class Die implements Comparable<Die>{
    ```
      
## Command Line Experimentation
1. Open *Die.java*, *CupOfDice.java* and *CupOfDiceDriver.java* read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Modify the faceValue instance variable in the Die class as shown below, making it static. Run the CupOfDiceDriver again and record the results.
    ```
    private static int faceValue;
    ```
    - When an instance variable has the static modifier specified as we did above, the variable becomes a class variable instead of an instance variable. An instance variable has memory allocated with each object (instance of the class) to hold the data.  However, a class variable has memory allocated within the class itself and this memory shared, in essence becoming a single variable that is shared between all instances of the class. Think about how changing the faceValue to static changed its behavior and record whether this makes sense given your understanding of instance variables vs class variables.

    - After changing faceValue from an instance variable to a class variable, you likely noticed a number of warning messages similar to the following:
    ```
    The static field Die.faceValue should be accessed in a static way
    ```
    This is a result of using the *this* operator to access faceValue.  The *this* operator means, THIS instance and since it is no longer an instance variable, it is no longer appropriate to access faceValue using the *this* operator.  Instead, replace all occurrances of **this.faceValue** with **Die.faceValue** and run the program again. Did this resolve the compilation warnings?


## Two Dimensional Array Experimentation
JavaDoc comments are incredibly useful when developing Java programs. They provide a way to describe not only what a program does, but also what the input parameters are and return values. Most modern IDEs have built in mechanisms that process these comments and display them as tooltips in the IDE as you are coding. However, these comments must follow the exact format described in the [Style Guide](https://docs.google.com/document/d/1LWbGQBKkApnNAzzgwOSvRM03DmhYWx5yEfecT2WXfjI/edit?usp=sharing) in order for them to be processed correctly.
1. Open *Die.java*, *CupOfDice.java* and *CupOfDiceDriver.java* read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Add the following JavaDoc comment to the shake() method in the CupOfDice class.  Then hover the mouse cursor over the call to shake() in the CupOfDiceDriver class and observe what is displayed.
    ```
    /**
     * Call the roll() method on each die in the cup.
     */
    public void shake() {
       ...
    ```
    
    - Add the following JavaDoc comment to the matching constructor in the CupOfDice class.  Then hover the mouse cursor over the call to the CupOfDice constructor in the CupOfDiceDriver class and observe what is displayed.
    ```
    /**
     * Instantiate a new ArrayList of Die objects. Instantiate the
     *    specified number of dice (numDice), each with the specified
     *    number of size (numSides) and add them to the ArrayList.
     * @param numDice Number of dice in the cup
     * @param numSides Number of sides on each Die.
     */
    public CupOfDice(int numDice, int numSides) {
       ...
    ```

    - Using the [Style Guide](https://docs.google.com/document/d/1LWbGQBKkApnNAzzgwOSvRM03DmhYWx5yEfecT2WXfjI/edit?usp=sharing) as a reference, add both class and method JavaDoc comments to both the Die and CupOfDice classes. Experiment with how and where these comments are displayed within the VSCode IDE and record your observations.
