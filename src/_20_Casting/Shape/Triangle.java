package _20_Casting.Shape;

/*
속성 : double 밑변, 높이 (base, height)
allArgs
area() : 삼각형 넓이 출력
drawInternal() : 삼각형 그리기 (밑변 : **, 높이 : **)
 */

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base*height/2;
    }

    @Override
    protected void drawInternal() {
        System.out.printf("삼각형을 그립니다. (밑변 : %f, 높이 : %f)\n",base,height);
    }
}
