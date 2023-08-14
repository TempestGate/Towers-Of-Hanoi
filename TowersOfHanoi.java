//Programmer: luis lopez
//Date: 7/30/32
/* This program aims to solve the classic Towers of Hanoi puzzle using recursion. 
The puzzle involves moving a stack of disks from one peg to another under certain constraints. 
The goal is to move the entire stack from the source peg to the target peg while adhering to 
the rules that only one disk can be moved at a time, and a larger disk cannot be placed on top
 of a smaller disk. The program will use a recursive approach to achieve this goal.
*/
public class TowersOfHanoi {

   public static void hanoi(int n, char source, char target, char auxiliary) {
        /*

         */

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        hanoi(n - 1, source, auxiliary, target);
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        hanoi(n - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        int numDisks = 4;
        char sourceTower = 'A';
        char targetTower = 'C';
        char auxiliaryTower = 'B';

        System.out.println("Solving Towers of Hanoi with " + numDisks + " disks:");
        hanoi(numDisks, sourceTower, targetTower, auxiliaryTower);
    }
}
