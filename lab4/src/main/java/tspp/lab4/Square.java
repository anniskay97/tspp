package tspp.lab4;


public class Square
{
	public int squareRomb(int side, double degrees)
    {
        double radians =  Math.toRadians(degrees);
        return  (int) Math.round(side*side*Math.sin(radians));
       
    }
    
     public static void main(String[] args) {
        Square a = new Square();
        int res  = a.squareRomb(6, 30.0);
         System.out.println(res);
    }
}
