package turtle;

import java.awt.geom.Point2D;
import java.util.List;
import java.util.Random;

public class TurtleShapes {

    /**
     * Draw a square.
     * @param t a Turtle
     * @param sideLength the length of one side of the square
     */
    public static void drawSquare( Turtle t, double sideLength ) {
        t.forward(sideLength);
        t.turn(90);
        t.forward(sideLength);
        t.turn(90);
        t.forward(sideLength);
        t.turn(90);
        t.forward(sideLength);
        t.turn(90);
    }

    /**
     * For a circle of radius r, returns the chord length for the given angle.
     * https://en.wikipedia.org/wiki/Chord_(geometry)
     *
     * There is a simple formula for this based on the sin function (see above Wikipedia
     * article).
     *
     * @param r the radius of the circle, must be > 0.0
     * @param angle the angle in degrees, where 0.0 < angle < 180.0
     * @return the chord length
     * @throws IllegalArgumentException if the radius or angle is invalid
     */
    public static double chordLength( double r, double angle ) {
        double chordLength;
        chordLength = 2* (Math.sin(angle/2));

        if(r <= 0 || angle <= 0) {
            throw new IllegalArgumentException("Invalid argument(s).");
        }
        return chordLength;
    }

    /**
     * Compute the **change in** the turtle's current heading that will make it face the
     * given point.  We'll talk about how to derive this in class.
     *
     * Hint: the Math.atan2 function will be helpful here.
     *
     * @param t the Turtle
     * @param pt the point
     * @return the change in the turtle's current heading that will turn it towards pt.
     */
    public static double calculateHeadingToPoint( Turtle t, Point2D.Double pt ) {
        throw new RuntimeException("Not implemented yet.");
    }

    /**
     * Compute and return the distance from the turtle's current position to the given
     * point.
     * @param t the Turtle
     * @param pt the point
     * @return the distance from the turtle's current position to pt
     */
    public static double distanceToPoint( Turtle t, Point2D.Double pt ) {

    }

    /**
     * Draw an approximation of a circle by drawing a many-sided regular polygon, using only right
     * turns.  Results are then shown in the GUI.
     *
     * @param t a Turtle
     * @param r the radius of the circle, must be > 0.0
     * @param sides the number of sides, must be >= 10
     * @throws IllegalArgumentException if the radius is 0.0 or less or sides is less than 10
     */
    public static void drawApproximateCircle( Turtle t, double r, int sides ) {
        for(int i = 0; i <= sides; i++){
            t.forward(chordLength(r, Math.atan(r)));
            t.turn(Math.atan(r));
        }
        if(r == 0.0) {
            throw new IllegalArgumentException("Illegal radius argument.");
        }
        else if(sides < 10){
            throw new IllegalArgumentException("Not enough sides.");
        }
    }

    /**
     * Draw a straight line through the given points in the order provided.
     *
     * @param t a Turtle.
     * @param pts a list of points for the turtle to move through
     */
    public static void drawThroughPoints( Turtle t, List<Point2D.Double> pts ) {
        for(int i = 0; i < pts.size(); i++){
            double moveX = pts.get(i).getX();
            double moveY = pts.get(i).getY();
            t.forward(moveX);
            t.turn(90);
            t.forward(moveY);
            t.turn(180);
        }

    }

    /**
     * Draw your own, custom piece of art!  Many interesting images can be drawn using this simple turtle.
     * See the assignment for examples.
     * @param t a Turtle
     */
    public static void art( Turtle t ) {
        t.forward(30);
        t.turn(30);
        t.forward(80);
        t.turn(90);
        t.forward(30);
        t.turn(30);
        t.forward(80);
        t.turn(90);
        t.forward(30);
        t.turn(30);
        t.forward(80);
        t.turn(90);
    }

    /**
     * Use this main method to manually test the above methods.
     */
    public static void main(String[] args) {

        // Replace this with your own tests
        Turtle t = new Turtle();
        drawSquare(t, 345.0);
        t.draw();

    }

}
