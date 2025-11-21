import java.util.Scanner;
public class MathOperations
{
    public static void main(String[] args){
        //Arithmetic Operator
        int a=5; 
        int b=8;
        System.out.println("Sum= "+(a+b));
        System.out.println("Difference= "+(a-b));
        System.out.println("Multiple= "+(a*b));
        System.out.println("Division= "+(a/b));
        System.out.println("Remainder= "+(a%b));
        
        //Unary Operator
        int h=1;
        System.out.println(h); 
        System.out.println(++h); 
        System.out.println(h); 
        System.out.println(h++); 
        System.out.println(h);
        
        //Assignment Operator
        int x= 5;
        x+=5;
        System.out.println(x);
        
        //Relational Operator
        int p=10, q=20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        
        //Logical Operator
        Scanner scan= new Scanner(System.in);
        int marks= scan.nextInt();
        System.out.println("Enter your marks:"+ marks);
        if (marks<=40){
        System.out.println("Student is fail.");
        }
        
        //Ternary Operator
        int age= scan.nextInt();
        System.out.println("Enter your age:"+ age);
        String canDrive=(age>=18)?"You can drive.":"You can't drive";
        System.out.println(canDrive);
    }
}