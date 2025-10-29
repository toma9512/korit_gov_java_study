package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        NonStaticMember nonStaticMember = NonStaticMember.builder()
                .name("정희원")
                .age(31)
                .email("gmldnjs985@gmial.com")
                .build();
    }
}
