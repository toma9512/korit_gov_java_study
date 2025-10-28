package _22_Bean;

public class Main {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("정희원");
        userEntity.setAge(31);
        userEntity.setEmail("gmldnjs985@gmail.com");
        System.out.println(userEntity);

        /*
        게시물 Entity
        게시물 아이디
        게시물 제목
        게시물 내용
        작성자 아이디
        작성자 닉네임
        생성 시각
        수정 시각
         */

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUsername("정희원");
        userEntityLombok.setAge(31);
        userEntityLombok.setEmail("gmldnjs985@gmail.com");
        System.out.println(userEntityLombok);

        /*
        Lombok
        자바의 반복적인 코드를 자동으로 생성해주는 라이브러리, 코드 다이어트를 위함
        getter, setter, toString, 생성자, builder

        자바
        .java 소스코드 -> 컴파일(.class파일 형식으로 변환)
        바이트 코드로 이루어짐 -> JVM에 전달 -> 실행
        -----> 빌드
        빌드를 도와주는 빌더가 있는데 종류가 maven, gradle
        얘네는 빌드를 전체적으로 효율적이고 자동화해주기 위한 외부 빌더 시스템
         */
    }
}
