
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author Grace Roland
 * @ version August 30, 2022
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 10;
        //System.out.print();
        
        //Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        //System.out.print();

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3-iNum2-iNum1));
        System.out.println(dNum2 + " -" + iNum4 + " = " + (dNum2 - iNum4));
        System.out.println();
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2)); 
        System.out.println(dNum2 + " * " + iNum4 + " * " + iNum4 + " = " + (dNum2 * iNum4 * iNum4));
        System.out.println();
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + iNum4 + " = " + (dNum1 / iNum4));
        System.out.println();
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(iNum4 + " % " + dNum2 + " = " + (iNum4 % dNum2));
        System.out.println();
        //System.out.println();
        
        //Declare integer values
        int iNum5 = 7;
        int iNum6 = 12;
        int iNum7 = 1;
        int iNum8 = 2;
        //System.out.print();
        
        //Random
        System.out.println("Random");
        System.out.println(iNum5 + " * " + iNum6 + " - " + iNum7 + " = " + (iNum5 * iNum6 - iNum7));
        System.out.println(iNum6 + " % " + iNum5 + " / " + iNum7 + " = " + (iNum6 % iNum5 / iNum7));
        System.out.println(iNum5 + " + " + iNum7 + " * " + iNum1 + " = " + (iNum5 + iNum7 * iNum1));
        //System.out.println();
        
        
        // 1.08 Additional int Equations
        
        
        // 1.09 Additional double Equations
        
               
    } // end of main method
} // end of class
