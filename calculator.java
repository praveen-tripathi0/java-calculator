import java.util.Scanner;
public class calculator {
    static int add(int a, int b){
        return a+b;

    }
    static int multiply(int a,int b){
        return a*b;
    }
    static double divide(int a,int b){
        return (double)a/b;
    }
    static int subtract(int a,int b){
        return a-b;
    }
    static int square(int a){
        return a*a;
    }
    static int cube(int a){
        return a*a*a;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first number");
        int z=s.nextInt();
        System.out.println("Enter the second number");  
        int y=s.nextInt();
        System.out.println("Enter the operation you want to perform\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Square\n6.Cube\n");
        int operation=s.nextInt();
        if(operation==1){
            System.out.println("The sum of the two numbers is "+add(z,y));
        }
        else if(operation==2){
            System.out.println("The difference of the two numbers is "+subtract(z,y));
        }
        else if(operation==3){
            System.out.println("The product of the two numbers is "+multiply(z,y));
        }
        else if(operation==4){
            System.out.println("The quotient of the two numbers is "+divide(z,y));
        }
        else if(operation==5){
            System.out.println("The square of the first number is "+square(z));
        }
        else if(operation==6){
            System.out.println("The cube of the first number is "+cube(z));
        }
        else{
            System.out.println("Invalid operation");
        }
         s.close();
    }

}
