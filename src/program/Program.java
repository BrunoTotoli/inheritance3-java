package program;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.println("Enter the number of shapes: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data");
            System.out.println("Rectangle or Circle (r/c)? ");
            Character x = in.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(in.next());
            if (x.equals('r')) {
                System.out.println("Width: ");
                Double width = in.nextDouble();
                System.out.println("Height");
                Double height = in.nextDouble();
                Shape rectangle = new Rectangle(color, width, height);
                list.add(rectangle);
            } else if (x.equals('c')) {
                System.out.println("Radius: ");
                Double radius = in.nextDouble();
                Shape circle = new Circle(color, radius);
                list.add(circle);
            } else {
                System.out.println("Invalid option");
            }
        }
        System.out.println("SHAPE AREAS: ");
        for (Shape a : list) {
            System.out.printf(String.format("%.2f \n",a.area()));
        }

    }
}
