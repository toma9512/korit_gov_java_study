package _20_Casting.Shape;

/*
속성 : double r(반지름)
AllArgsConstructor
area() : 원이 넓이 구하는 공식
drawInternal() : 출력 (원 그리기 반지름 = **)
원주율 : 3.14
 */

public class Circle extends Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*3.14;
    }

    @Override
    protected void drawInternal() {
        System.out.println("원을 그립니다. (반지름 : "+r+")");
    }
}
