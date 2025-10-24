package _17_Inheritance;

public class Animal {
    private String animalName;
    private int animalAge;

    // AllArgsConstructor 생성 - getter/setter 만들고

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public Animal() {
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    // 메소드에 move만들기 - "움직입니다" 출력

    public void move() {
        System.out.println("움직입니다");
    }
}
