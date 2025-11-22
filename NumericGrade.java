import java.util.Scanner;

/**
 * Write a description of class NumericGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumericGrade
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int grade= scan.nextInt();
        System.out.println("Enter your grade:"+ grade);
        String result= (grade>=40)? "Pass": "Fail";
        System.out.println(result);
    }
}