import java.util.*;

public class Volume {
    void volume(int l, int b, int h) {
        int ans = l * b * h;
        System.out.println(ans);
    }

    void volume(int s) {
        System.out.println(s * s * s);
    }

    void volume(double r, double h) {
        double ans = (22*r*r*h)/7;
        System.out.println(ans);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Volume obj = new Volume();
        System.out.println("Enter the length, breadth and height of the cuboid :");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        obj.volume(l, b, h);
        System.out.println("Enter the side of the cube :");
        int s = sc.nextInt();
        obj.volume(s);
        System.out.println("Enter the radius and height of the cylinder :");
        double r = sc.nextDouble();
        double height = sc.nextDouble();
        obj.volume(r, height);
        sc.close();
    }
}
