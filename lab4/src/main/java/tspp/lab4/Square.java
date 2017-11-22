package tspp.lab4;


public class Square
{
	public float squareRomb(int d, int e)
    {
        double radians =  Math.toRadians(e);
        return (float)(d*d*Math.sin(radians));
       
    }
    
     public static void main(String[] args) {
        Square a = new Square();
        float res  = a.squareRomb(3, 30);
         System.out.println(res);
    }
}
