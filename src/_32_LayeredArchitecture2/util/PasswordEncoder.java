package _32_LayeredArchitecture2.util;

import java.util.Objects;

public class PasswordEncoder {
    private static final String secrets = "암호화비밀번호";

    public static String encode(String str) {
        if (str == null) return null;
        long hash = Integer.toUnsignedLong(Objects.hash(str));
        long encodeHash = hash + Objects.hash(secrets);
        return Long.toHexString(encodeHash); // 16진수로 반환
    }

    public static boolean match(String 평문, String 암호문) {
        if (평문 == null || 암호문 == null) {
            return false;
        }
        return encode(평문).equals(암호문);
    }
}
