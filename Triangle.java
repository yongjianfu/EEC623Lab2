/* This is the Triangle class  */
public class Triangle {

	private int side1, side2, side3; 

        /**
         * Constructs a triangle from the three given edges.
         * @author James Williamson Jr.
         * 
         * @param a the length of the first triangle side
         * @param b the length of the second triangle side
         * @param c the length of the third triangle side
         */
        public Triangle(int a, int b, int c) 
        { 
            /*
             * Normally, we might bounds check the side lengths. For this 
             * simple lab, no check is performed.
             */
            this.side1 = a;
            this.side2 = b;
            this.side3 = c;
        }

	/**
	 * Constructs a triangle with edges all 0.
	 * Author: Mark Chesnes 2631975
	 */
	public Triangle() { 
	    this.side1 = 0;
            this.side2 = 0;
            this.side3 = 0;
	}
	

	/**
	 * Equilateral: a valid triangle that all three sides are the same;
	 */
	public boolean isEquilateral()	{
	if ((side1 == side2) && (side1 == side3))
	return true;
	else
	return false;

	}

	/**
	 * Isosceles: a valid triangle that two sides are the same, but not the third;
	 */
	public boolean isIsosceles(){
		//Added by Jay Mehta (2634272) and Parita Parekh (2620134).
		if (( side1 == side2 && side2 != side3 ) || ( side1 == side3 && side1 != side2 ) || ( side2 == side3 && side3 != side1 ))
		return true;
		else
		return false;
	}

	/**
	 * Scalene: a valid triangle that none of the side is the same as another
	 */
	public boolean isScalene() {
	if((side1!=side2)&&(side2!=side3)&&(side3!=side1))
	return true;
	else
	return false;
	
	}

	/**
	 * Right: a valid triangle that the sum of square of two sides equals to the square of the third side;
	 */
	public boolean isRight(){ 
	//Changes made by Sravya Rudraraju and Navya Alapati 
	 if (((side1*side1) == ((side2*side2) + (side3*side3))) ||
          ((side2*side2) == ((side1*side1) + (side3*side3))) ||
          ((side3*side3) == ((side1*side1) + (side2*side2))))
         return true;
      else
         return false;
		
	}

	/**
	 * set the side1 of the triangle
	 * Ravi Kandoi
	 */
	public void setSide1(int a){
	
	this.side1 = a;
	// change made by Ravi Kandoi
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
	 * @author khaled souiher 
	 */
	public int getSide1(){
		return side1;
		
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
		//Changes made by Ankur Mantri and Nihar Sheth
		return side1+side2+side3;
	}
	
	/**
	 *Description: Method to get the area of triangle using Heron's Formula
	 * 
	 *Input Params: lengths of all the three sides of the Triangle
	 * 
	 * Changes By: Ravi Theja V and Megha Gowni
	 */
	public double getAreaUsingHeronsFormula(double side1,double side2,double side3)
	{
		 double s = (0.5)*(side1+side2+side3);
		 double area = java.lang.Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		 return area;

	}

	/**
	 * Does the three edges form a valid triangle?
	 */
	 //change by Bhushan and Chakri
	private boolean isTriangle() {
		if ((side1+side2>side3)||(side2+side3>side1)||(side3+side1>side2));
		return true;
		else
		return false;
	}
}
