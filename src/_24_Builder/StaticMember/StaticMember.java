package _24_Builder.StaticMember;

public class StaticMember {
    private String name;
    private int age;
    private String email;

    private StaticMember(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class Builder {
        private String name;
        private int age;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public StaticMember build() {
            return new StaticMember(this);
        }
    }
}
