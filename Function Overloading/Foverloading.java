import java.util.Scanner;

public class Foverloading {
    void area(int l, int b) {
        int area = l * b;
        System.out.println("Area of a rectangle = " + area);
    }

    void area(float s) {
        float area = s * s;
        System.out.println("Area of a square = " + area);
    }

    void area(double r) {
        double area = 22 / 7 * r * r;
        System.out.println("Area of a circle = " + area);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Foverloading obj = new Foverloading();
        System.out.print("Enter the length of the rectangle : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        int b = sc.nextInt();
        obj.area(l, b);
        System.out.print("Enter the side of a square : ");
        float s = sc.nextFloat();
        obj.area(s);
        System.out.print("Enter the radius of the circle : ");
        double r = sc.nextDouble();
        obj.area(r);
        sc.close();
    }
}
