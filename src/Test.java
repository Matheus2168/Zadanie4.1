public class Test {

    public static void main(String[] args) {

    Triangle triangle = new Triangle(4,4,5);
    TriangleChecker tc = new TriangleChecker();
    System.out.println(tc.isRightTriangle(triangle));


    }
}
