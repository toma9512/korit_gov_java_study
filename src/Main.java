import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {1,2,3};

        System.out.println(Arrays.equals(arr, arr1));
        int[] temp = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.equals(arr, temp));
        System.out.println(arr == temp);
    }
}

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 데이터 준비
        Integer[] sorted = Arrays.stream(rank).boxed().toArray(Integer[]::new);
        List<Integer> rankList = new ArrayList<>(Arrays.asList(sorted));
        int answer = 0;
        int count = 2;

        // 정렬
        Arrays.sort(sorted, Collections.reverseOrder());

        System.out.println(Arrays.binarySearch(rank, 2));
        // 반복
        for (Integer i : sorted) {
            int temp = (int) Math.pow(100, count);
            if (attendance[rankList.indexOf(i)]) {
                answer += rankList.indexOf(i) * temp;
                count--;
            }

            // 3개 채워지면 종료
            if (count < 0) break;
        }

        // 리턴
        return answer;
    }
}
