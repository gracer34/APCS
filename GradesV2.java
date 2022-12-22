
/**
 * The purpose of this program is to calculate the total points and average grade 
 * each time a new score is added to the total.
 *
 * @author Grace Roland
 * @version 9/6/2022
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0;   //counts number of tests
        int testGrade = 0;   //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;   //average grade
        
        //declare test grade #1
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # 1    Test Grade: " + testGrade + 
        "  Total Points: " + totalPoints + "   Average Score: " + average);
        
        //add test #2
        testGrade = 73;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # 2    Test Grade: " + testGrade +
        "  Total Points: " + totalPoints + "  Average Score: " + average);
        
        //add test #3
        testGrade = 91;
        totalPoints+= testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # 3    Test Grade: " + testGrade +
        "  Total points: " + totalPoints +  "  Average Score: " + average);
        
        
        //add test #4
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # 4    Test Grade: " + testGrade +
        "  Total points: " + totalPoints + "  Average Score: " + average);
        
        
    
    
    }
}
