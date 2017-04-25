import java.util.*;

public class PointClientA{
    public static void main(String[] args){

    	Point mooDefault = new Point();
		System.out.println("mooDefault = " + mooDefault);

    	Scanner console = new Scanner(System.in);
		int x = getNumber("Enter x-value: ", console);
		int y = getNumber("Enter y-value: ", console);

        Point moo = new Point(x,y);
        System.out.println("moo = " + moo);
        System.out.println("moo = "+ "(" +moo.x +","+ moo.y + ")");

        moo.translate(2,2);
        moo.setXY(moo.getX(),0);
        moo.translate(0,19);
        moo.setXY(moo.getY(),moo.getX());
		System.out.println("(" + moo.getX() + ", " + moo.getY() + ")");
		System.out.println("Quadrant: " + moo.getQuadrant());
		System.out.println("Distance to origin: " + moo.distanceToOrigin());

		System.out.println("x = " + x); //prints PointClient x (variable in PointClient scope)
		System.out.println("x = " + moo.getX()); //prints Point x (field in Point scope)
		System.out.println("moo = " + moo); //the toString method is implicitly called
		System.out.println("moo = " + moo.toString()); // produces same output as lien above
	}

	public static int getNumber(String prompt, Scanner console){
		System.out.print(prompt);
		int num = console.nextInt();
		return num;
	}

}
