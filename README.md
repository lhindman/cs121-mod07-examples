# CS121 - Module 7 - Arrays Guided Experimentation
The purpose of this guided experimentation is to provide students with an opportunity to experiment with the code examples presented in the lecture. It is important to keep detailed observation notes as you work through the experiments below. These observations will be useful to you as you complete the labs and you will be allowed to reference them on open book / open note quizzes. You will not be required to turn in your observations.
## Getting Started
To get started on this activity, please clone this repository into your development environment  

Steps to Clone Examples
1. Copy the URL for this repo by clicking the green "Code" button above, select HTTPS then click the copy icon.
2. Open VSCode, click the Source Control icon then click Clone Repository.
3. Paste the repo URL into the "Provide repository URL" field and press Enter.
4. Browse to the location in your development environment where you want to store the repostory and click Select Repository Location.
5. When prompted, Open the repository then Open the workspace.

## Arrays of Objects Experimentation 
1. Open *Grade.java* and *GradeRange.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - This example code has been modified to better demonstrate the power of Arrays of Objects. An initializer list is used to populate the grades[] with objects. when you run the program note the order that that the grade objects are displayed in the console.  Record your observations.
    - Review the code for the Grade class. Notice that it implements the Comparable<Grade> interface, which means it provides a compareTo() method designed to compare two Grade objects. When we have an array of Comparable objects, we can use the static methods provided in the Collection class to sort our array. Append the following code to the end of the main() method in GradeRange. You will need to import java.util.Arrays. What is the result and why?
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
In the deeper look videos, we discussed how in Java, Arrays are treated like objects and that when an Array is passed as an argument to a method, a copy of the reference to the array is passed, not a copy of the the array itself. This means that when we modify the contents of an array within a method, those changes are visible to any code that holds a reference to that Array. The goal of the following experiment is to help reinforce this idea of a copy of the reference being passed.
1. Open *ArrayPassing.java*, read the code and run it to ensure it functions properly. Then work through each of the experiments below and record your observations.
    - Add the following code to the main() method immediately after instantiating the new int[] array to display the value stored in the variable X.   What is the result and why?
    ```
	System.out.println("The reference value stored in X is: " + X);
    ```
    - Add the following code to the changeArray() method to display the value stored in the variable a. Compare this value with the one stored in X.  What is the result and why?
    ```
	System.out.println("The reference value passed to changeArray is: " + a);
   ```
## Command Line Experimentation
The command line provides a convient way for the end user to supply information to a program without the need to user a scanner and read the content from System.in.  However, developing a program that takes command line input in an IDE, such as VSCode, isn't nearly as convenient.  In the steps below you will experiement with two different ways of passing command line arguments to a program: using the terminal and using a custom run config in VSCode.
1. **Using the Terimal:** From the *EXPLORER* view in VSCode, right click on the *CommandLineArguments* folder and select **Open in Integrated Terminal.** 
    - In the terminal, build the CommandLineEcho program using the following command
    ```
    javac CommandLineEcho.java 
    ```
    - In the terminal, run the CommandLineEcho program passing Hello World as command line argument as follows:
    ```
    java CommandLineEcho Hello World
    ```
1. **Using the VSCode:** Click the Run and Debug icon on the left of the VSCode screen. Then click *create a launch.json file* and select the CommandLineArguments workspace folder. This displays a customized launch.json in the editor window, populated with Launch entries for both CommandLineEcho and CommandLineValidation. Modify the Launch entry for CommandLineEcho by adding an args entry as shown below. Save the changes and close the launch.json file. Then execute CommandLineEcho by clicking the run link above the main() method. 
    ```
    {
        "type": "java",
        "name": "Launch CommandLineEcho",
        "request": "launch",
        "mainClass": "CommandLineEcho",
	"args": ["hello", "world"],
        "projectName": "CommandLineArguments_e0f2b6bd"
    },
    ````

