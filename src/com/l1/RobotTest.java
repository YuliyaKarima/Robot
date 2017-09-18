package com.l1;
import java.util.*;

/**This class tests Robot class methods
 * In this class a Robot object is created
 * and then user can use it's methods to transfer it on the plain
 *
 */
public class RobotTest {

    public static void main(String[] args) {

        //Cretes new Robot object with start coordinates {0,0}
        Robot robot = new Robot(0,0);
        //prints information about Robot's current position
        System.out.println(robot);
        //transfers Robot to new position
        robot.goTo(newCoordinates());
        //prints information about Robot's current position
        System.out.println(robot);
        //transfers Robot on definite count of steps in horizontal way
        System.out.println("Enter count of steps in horizontal way:");
        robot.goHorozontal(new Scanner(System.in).nextInt());
        System.out.println(robot);
        //transfers Robot on definite count of steps in vertica way
        System.out.println("Enter count of steps in vertical way:");
        robot.goVertical(new Scanner(System.in).nextInt());
        System.out.println(robot);
        System.out.println("Enter count of steps back in vertical way:");
        robot.goVerticalBack(new Scanner(System.in).nextInt());
        System.out.println(robot);
        System.out.println("Enter count of steps back in horizontal way:");
        robot.goHorozontalBack(new Scanner(System.in).nextInt());
        System.out.println(robot);

    }

    /**Creates Coordinats object using user input data from console
     *
     * @return new Coordinates object
     */
    public static Coordinates newCoordinates (){
        Coordinates newCoord = new Coordinates();
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter new coordonates:");
             if (scanner.hasNextInt()){
                 newCoord.setX(scanner.nextInt());
                 if (scanner.hasNextInt()){
                     newCoord.setY(scanner.nextInt());
                 }
                 else{
                     System.out.println("You entered not a number ");
                 }
           }
           else {
               System.out.println("You entered not a number ");
           }
        return  newCoord;
    }
}
