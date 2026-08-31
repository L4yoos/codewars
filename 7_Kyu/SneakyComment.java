// https://www.codewars.com/kata/6a85bc13ce8b0aee7b758e0e

// To solve this kata you need to figure out how to print the word "UNICODE" to the standard output while having every line inside your main() method commented out with double slashes //.
//
// In other words, every line which is not blank should be commented out, except for declarations of the class and method main(), which must not be altered. Introducing additional class members (such as static fields, initializers and methods) is prohibited.
//
// If the task is clear, go ahead and try it out. Otherwise, if you don't know where to start, pay attention to the pointers below.
//
// HINTS:
//
// The key to this puzzle is understanding what Unicode escape sequences are and how Java compiler (javac) treats them.
// Spoiler: in order to normalize the source code compiler processes them before performing tokenization (i.e. identifying keywords, literals, operators, etc. in your code).
//
// Even if the spoiler clicked for you, remember: there’s a whole world of compiler magic to explore!
//
// Next, think of a character that disrupts a single-line comment and causes a seemingly commented out statement to execute.

public class SneakyComment {
    public static void main(String[] args) {
        // Do Your Magic
        // Change the comment bellow so that System.out.print gets executed
        // \u000A System.out.print("UNICODE");
    }
}