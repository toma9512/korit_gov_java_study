package _20_Casting.Shape;

/*
render() : preDraw(), drawInternal(), postDraw(); 호출
// protected
preDraw() : 출력(그리기 준비)
postDraw() : 출력(그리기 마무리)

추상 메소드
area() : double(넓이)
drawInternal() : void (protected)
 */

public abstract class Shape {
    public abstract double area();
    protected abstract void drawInternal();

    protected void preDraw() {
        System.out.println("그리기 준비");
    }

    protected void postDraw() {
        System.out.println("그리기 마무리");
    }

    public void render() {
        preDraw();
        drawInternal();
        postDraw();
    }
}
