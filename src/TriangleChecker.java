public class TriangleChecker {



    public boolean isRightTriangle(Triangle triangle){

        double longest;
        double shorter1;
        double shorter2;

        if (triangle.getA() > triangle.getB() && triangle.getA() > triangle.getC()) {
            longest = triangle.getA();

        }

        else if (triangle.getB() > triangle.getA() && triangle.getB() > triangle.getC()) {
            longest = triangle.getB();

        }

        else if (triangle.getC() > triangle.getA() && triangle.getC() > triangle.getB()) {
            longest = triangle.getC();
        }

        else {longest = 0;}


        if (longest == triangle.getA()){
            shorter1 = triangle.getB();
            shorter2 = triangle.getC();
        }
        else if (longest == triangle.getB()){
            shorter1 = triangle.getA();
            shorter2 = triangle.getC();
        }
        else if (longest == triangle.getC()){
            shorter1 = triangle.getA();
            shorter2 = triangle.getB();
        }
        else {shorter1 = 0;shorter2 = 0;return false;} //jezeli nie ma najduzszego boku trojkat nie moze byc prostokatny

        System.out.println(longest +" > > > "+shorter1+" ; "+shorter2);

        if (Math.pow(longest,2) == Math.pow(shorter1,2)+Math.pow(shorter2,2))
           return true;
        else return false;

    }
}
