package _20_Casting.Shape;

/*
속성 : double w, h (가로, 세로)
AllArgs
area() : 직사각형 넓이 출력
drawInternal() : 직사각형 그리기 (가로 : **, 세로 : **)
 */

public class Rectangle extends Shape {
    double w;
    double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w*h;
    }

    @Override
    protected void drawInternal() {
        System.out.printf("사각형을 그립니다 (가로 : %f, 세로 : %f)\n",w,h);
    }
}
