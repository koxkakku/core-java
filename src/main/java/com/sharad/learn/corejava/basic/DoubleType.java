package com.sharad.learn.corejava.basic;
/**
 * @author koxkakku
 */
public class DoubleType {
	public static void main(String[] args)
    {
  
        
        double b = 78.05;
        String bb = "65";
  
        // Construct two Double objects
        Double x = new Double(b);
        Double y = new Double(bb);
  
        // Method - toString()
        System.out.println("toString(b) = "
                           + Double.toString(b));
  
        // Method - valueOf()
        // Return Double object
        Double z = Double.valueOf(b);
        System.out.println("valueOf(b) = " + z);
        z = Double.valueOf(bb);
        System.out.println("ValueOf(bb) = " + z);
  
        // Method - parseDouble()
        // Return primitive double value
        double zz = Double.parseDouble(bb);
        System.out.println("parseDouble(bb) = " + zz);
  
        // Print statements
        System.out.println("bytevalue(x) = "
                           + x.byteValue());
        System.out.println("shortvalue(x) = "
                           + x.shortValue());
        System.out.println("intvalue(x) = " + x.intValue());
        System.out.println("longvalue(x) = "
                           + x.longValue());
        System.out.println("doublevalue(x) = "
                           + x.doubleValue());
        System.out.println("floatvalue(x) = "
                           + x.floatValue());
  
        int hash = x.hashCode();
        System.out.println("hashcode(x) = " + hash);
  
        boolean eq = x.equals(y);
        System.out.println("x.equals(y) = " + eq);


    }
}
