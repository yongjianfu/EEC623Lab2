/* This is the Triangle class  */
public class Triangle {

	private int side1, side2, side3; 

	/**
	 * Constructs a triangle from the three given edges.
	 */
	public Triangle(int a, int b, int c) { 
	
	}

	/**
	 * Constructs a triangle with edges all 0.
	 */
	public Triangle() { 
	}
	

	/**
	 * Equilateral: a valid triangle that all three sides are the same;
	 */
	public boolean isEquilateral()
	{
	if ((side1 == side2) && (side1 == side3))
         return true;
      	else
         return false;
	}

	/**
	 * Isosceles: a valid triangle that two sides are the same, but not the third;
	 */
	public boolean isIsosceles(){
	}

	/**
	 * Scalene: a valid triangle that none of the side is the same as another
	 */
	public boolean isScalene(){
	}

	/**
	 * Right: a valid triangle that the sum of square of two sides equals to the square of the third side;
	 */
	public boolean isRight(){
	}

	/**
	 * set the side1 of the triangle
	 */
	public void setSide1(int a){
	}

	/**
	 * set the side2 of the triangle
	 */
	public void setSide2(int b){
	}

	/**
	 * set the side3 of the triangle
	 */
	public void setSide3(int c){
	}


	/**
	 * get the side1 of the triangle
	 */
	public int getSide1(){
	}

	/**
	 * get the side2 of the triangle
	 */
	public int getSide2(){
	}

	/**
	 * get the side3 of the triangle
	 */
	public int getSide3(){
	}

	/**
	 * get the area of the triangle, return -1 if not a valid triangle
	 */
	public double getArea(){
	}

  	/**
	 * get the perimeter of the triangle, return -1 if not a valid triangle
	 */

	public double getPerimeter() {
	}

	/**
	 * Does the three edges form a valid triangle?
	 */
	private boolean isTriangle() {
	}
}
