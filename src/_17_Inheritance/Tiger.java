package _17_Inheritance;

/*
super는 부모에게 접근할 수 있는 키워드
super를 사용하는데 두가지 방식이 존재
1. super() : 부모 클래스의 생성자를 호출하는 키워드
                만약, NoArgs -> super()
                만약, AllArgs -> super(필드 속성값들,...)
2. super.메소드명() : 부모 클래스의 메소드를 호출한 것
3. super.속성 : 부모 클래스의 속성을 호출한 것
 */

public class Tiger extends Animal {
    // Animal에게 상속 받아 Animal의 속성을 그대로 받은 상태
    // 이때, 부모 클래스에는 없는 속성을 따로 추가할 수 있다.
    private boolean isStriped;
    // 따라서, 부모에게 있는 속성만 getter/setter가 있음
    // 그러므로, 자식 클래스에서 추가한 필드 속성도 getter/setter를 만들어줘야한다.

    public Tiger(String animalName, int animalAge, boolean isStriped) {
        // 고유 필드 속성을 대입하기 전에 부모의 속성을 먼저 생성자 호출을 해야 한다.
        super(animalName, animalAge);
        this.isStriped = isStriped;
    }

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

    // 오버라이딩
    // 상속 관계에서 자식 클래스가 부모 클래스의 메소드를 재정의하는 것
    // 부모로부터 물려받은 메소드를 자식이 '다르게' 실행되도록 바꾸는 것
    // 부모 클래스의 메소드를 자식 클래스에서 동일한 이름, 매개변수, 리턴타입으로 다시 정의하는 것
    // - 자식 클래스에 맞게 다르게 동작시켜야 할 때
    // 부모 클래스의 접근제어범위가 더 좁아야한다.

    /*
    어노테이션(시그니처)
    코드에 붙이는 꼬리표
    이 코드는 이런 용도로 사용되니 좀 특별하게 유심히 잘 봐줘
    코드를 읽고 컴퓨터가 이해하도록 어노테이션을 달아주면 컴퓨터가
    어노테이션을 보고 인식함
     */
    @Override
    public void move() {
        System.out.print("호랑이가 ");
        super.move();
    }

    public void hunt() {
        System.out.println(getAnimalName() + "호랑이가 사냥을 합니다.");
        /*
        상속을 했을 때 메소드를 호출 시 탐색에는 순서가 있다
        자식 클래스에서 해당 메소드가 없다면 부모 클래스에서 찾는다
         */
    }
}
