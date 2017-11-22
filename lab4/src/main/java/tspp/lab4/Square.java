package tspp.lab4;


public class Square
{
	public float squareRomb(int d, int e)
    {
        double radians =  Math.toRadians(e);
        if(d > 0 && e > 0 && e < 180) {
        	return (float)(d*d*Math.sin(radians));
        			}
        else {
        	System.out.println("ERROR");
        	return 0;
        		}
    }
    
    
     public static void main(String[] args) {
        Square a = new Square();
        float res  = a.squareRomb(8, 30);
         System.out.println(res);
    }
}
