import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setData();
        r.getData();

    }

}

class Rectangle {

    int length, width, area;

    void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rectangle Length =");
        length = sc.nextInt();
        System.out.print("Enter Rectangle Length =");
        width = sc.nextInt();
        area = length * width;
    }

    void getData() {

        System.out.println("Area Of Rectangle = " + area);
    }
}
