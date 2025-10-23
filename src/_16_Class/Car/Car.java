package _16_Class.Car;

public class Car {
    // 속성 === 필드 === 멤버변수
    String carName;
    int carYearModel;
    String carColor;

    // Car 클래스의 생성자
    // 필드 값이 아무것도 들어가지 않는 생성자
    Car() {
        System.out.println("객체가 생성되었습니다.");
        System.out.println("NoArgsConstructor");
    }

    /*
    this는 해당 클래스로 만들어진 자기 자신 객체를 의미(참조)
    this를 왜 써야하는가? 속성의 이름과 매개변수의 이름이 같을 경우
    명확히 하기 위해서 this를 쓴다
    속성의 이름과 매개변수의 이름이 다를 경우는 this가 생략 가능
     */
    // 필드 속성 중 carName만 값을 주입하는 생성자
    Car(String carName) {
        this.carName = carName;
        System.out.println("RequiredArgsConstructor");
    }

    // 필드 속성 모두 값을 주입하는 생성자
    Car(String carName, int carYearModel, String carColor) {
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
        System.out.println("AllArgsConstructor");
    }

    public void startCar() {
        System.out.println(carName + "가 시동을 겁니다.");
    }

    public void drive() {
        System.out.println(carName + "가 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + "가 정지합니다.");
    }

    public void showInfo() {
        System.out.println("자동차 이름은 "+ carName);
        System.out.println("자동차 연식은 "+ carYearModel);
        System.out.println("자동차 색상은 "+ carColor);
    }
}
