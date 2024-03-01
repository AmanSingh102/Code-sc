import java.util.Scanner;

class Calculator
{
    float operation(String operator, float num1, float num2)
    {
        switch( operator )
        {
            case "+" : 
            return num1 + num2;

            case "-" :
            return num1 - num2;

            case "*" : 
            return num1 * num2;

            case "/" :
            return num1 / num2;

            default : 
            System.out.println("Invalid Operator !!!!");
        }
        
        return num1;
    }
}

public class Java_7_Pro_Calculator_With_Class_By_Expression
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            Calculator calculate = new Calculator();

            float num1,anothernumber;
            String operator;

            System.out.print("\n-------- Pro Calculator ---------\n");
            System.out.print("\nWrite Your Expression : ");
            num1 = sc.nextInt();
            
            while(true)
            {
                operator = sc.next();

                if( operator.equals("=")) { break ;}

                anothernumber = sc.nextInt();

                num1 = calculate.operation(operator, num1, anothernumber);
            }

            System.out.println("Solution of above expression is " + num1);
            System.out.print("\n-----------------------------\n\n");

        sc.close();    
    }
}
