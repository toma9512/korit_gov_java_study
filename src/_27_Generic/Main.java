package _27_Generic;

public class Main {
    public static void main(String[] args) {
        // ResponseData responseData = new ResponseData();
        // responseData.setData1("어떠한 데이터");
        // responseData.setMessage("String 데이터 메시지");
        // System.out.println(responseData.toStringStr());
        ResponseData<String> responseData1 = new ResponseData<>();
        ResponseData<Integer> responseData2 = new ResponseData<>();

        String str = GenericEx.identify("hello");
        System.out.println(str);
    }
}
