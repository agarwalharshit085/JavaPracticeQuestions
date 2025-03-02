// Question to demonstrate polymorphism
import java.util.Scanner;
class Polymorphism
{
    public static float area(float length,float breadth)
    {
        return length * breadth;
    }
    public static float area(float radius)
    {
        return ((22 / 7) *radius * radius);
    }
    public static int area(int side)
    {
        return side * side;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and Breadth of rectangle : ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();

        System.out.println("Area of rectangle is  : "+area(length, breadth)+ " meter-square");

        System.out.println("Enter the radius of the circle : ");
        float radius = sc.nextFloat();
        System.out.println("Area of Circle is : "+area(radius) + " meter-square");

        System.out.println("Enter the side of the square : ");
        int side = sc.nextInt();
        System.out.println("Area of the square is : "+area(side)+ " meter-square");

        sc.close();
    }
}
