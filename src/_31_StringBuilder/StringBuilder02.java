package _31_StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        final int lengths = 50000;

        long startTime1 = System.currentTimeMillis(); // 시작
        String str = "";
        for (int i=0; i<lengths; i++) {
            str += "*";
        }

        long endTime1 = System.currentTimeMillis(); // 끝
        System.out.println("String : "+(endTime1-startTime1));

        long startTime2 = System.currentTimeMillis(); // 시작
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<lengths; i++) {
            sb.append("*");
        }

        long endTime2 = System.currentTimeMillis(); // 끝
        System.out.println("StringBuilder : "+(endTime2-startTime2));
    }
}
