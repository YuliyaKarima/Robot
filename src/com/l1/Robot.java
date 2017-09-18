package com.l1;

/**
 * Class Robot that encapsulates current Robot's position
 */
public class Robot {
    private int x;
    private int y;
    private Coordinates coordinates;

    /**
     * Constructor sets values to both coordinates
     * @param a_x value of x coordinate
     * @param a_y value of y coordinate
     */
      public Robot(int a_x, int a_y){
          x = a_x;
          y = a_y;
          coordinates = new Coordinates();
          coordinates.setX(a_x);
          coordinates.setY(a_y);
      }

    /**Constructor sets position of Robot object
     *
     * @param newCoord position of Robot object
     */

    public Robot(Coordinates newCoord){
          coordinates = newCoord;
          x =  coordinates.getX();
          y = coordinates.getY();
      }

    /**Gets value of x coordinate
     *
     * @return x coordinate
     */
    private int getX() {
        return x;
    }

    /**Sets new value of x coordinate
     *
     * @param a_x new x coordinate
     */
    private void setX(int a_x) {
        coordinates.setX(a_x);
        x = a_x;
    }

    /**Gets value of y coordinate
     *
     * @return y coordinate
     */

    private int getY() {
        return y;
    }

    /**Sets new value of x coordinate
     *
     * @param a_y new y coordinate
     */
    private void setY(int a_y) {
        coordinates.setY(a_y);
        y = a_y;
    }

    /**Changes values of both x and y coordinates
     *
     * @param a_x new x coordinate
     * @param a_y new y coordinate
     */
    private void setXY(int a_x, int a_y){
        coordinates.setY(a_y);
        coordinates.setX(a_x);
        x = a_x;
        y = a_y;
    }

    /**Gets Coordinates object
     *
     * @return current position of Robot object
     */

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
        x = coordinates.getX();
        y = coordinates.getY();
    }

    /**Overrides Object's method to print information about current Robot's position
     *
     * @return text with information about current Robot's position
     */

    public String toString(){
      return "Current Robot's coordinates are: {" + getX() + ", " + getY()+"}";
    }

    /**Sets new coordinates for Robot object
     *
     * @param a_coordinates object of Coordinates class that sets position of Robot object
     */

    public void goTo(Coordinates a_coordinates){
        setCoordinates(a_coordinates);
    }

    /**Sets new y coordinate (Robot goes in vertial way
     *
     * @param step count of steps Robot should go in vertical way
     */
    public void goVertical(int step){
        setY(getY()+step);
    }

    /**Sets new x coordinate (Robot goes in horizontal way)
     *
     * @param step count of steps Robot should go in horizontal way
     */
    public void goHorozontal(int step){
       setX(getX()+step);
    }
    /**Sets new y coordinate (Robot goes back in vertial way
     *
     * @param step count of steps Robot should go back in vertical way
     */
    public void goVerticalBack(int step){
        setY(getY()-step);
    }
    /**Sets new x coordinate (Robot goes back in horizontal way)
     *
     * @param step count of steps Robot should go back in horizontal way
     */
    public void goHorozontalBack(int step){
        setX(getX()-step);
    }
}
