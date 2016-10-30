/* Siia kirjutan hajutused 4.1 ja 4.2 */

/*//4.1
public class Harjutused {
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {

        System.out.println(".");

    }


    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

}
*/

/*Excercise 4.1 vastused:
1. What is the output of the program?

    Output:
   No, I wug.
   You wugga wug.
   I wug.

2. Draw a stack diagram that shows the state of the program the first time
ping is invoked .

Output:
No, I wug.

3.What happens if you invoke baffle(); at the end of the ping method?

It causes an infinite loop and stack overflow error.

Exercise 4.2 vastused:
1. Write the first line of a method named zool that takes three parameters:
an int and two Strings.


 *///4.2
public class Harjutused {
    public static void zool(int a, String b, String c){
    }
    public static void main(String[]args){
        zool(11, "Muki", "Kase tänav");

    }
}