package _24_Builder.NonStaticMember;

public class NonStaticMember {
    private String name;
    private int age;
    private String email;

    private NonStaticMember() {
    }

    // 인스턴스 클래스(내부 클래스)
    public class Builder {
        private final NonStaticMember target;

        private Builder(NonStaticMember target) {
            this.target = target;
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }

        public Builder age(int age) {
            target.age = age;
            return this;
        }

        public Builder email(String email) {
            target.email = email;
            return this;
        }

        public NonStaticMember build() {
            return target;
        }
    }

    public static NonStaticMember.Builder builder() {
        NonStaticMember nonStaticMember = new NonStaticMember();
        return nonStaticMember.new Builder(nonStaticMember);
    }
}
