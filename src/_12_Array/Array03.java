package _12_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        // 정렬
        int[] nums = {8,4,5,1,7,10,6,2,9,3};
        System.out.println(Arrays.toString(nums));

        // sort()
        Arrays.sort(nums); // 오름차순 정렬
        System.out.println(Arrays.toString(nums));

        // 내림차순 정렬
        for (int i=0; i<nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(nums));

        // 내림차순
        Integer[] arr = {8,4,5,1,7,10,6,2,9,3};
        Arrays.sort(arr, Comparator.reverseOrder());
        // 정수형 배열을 내림차순으로 정렬하기 위해서는 Integer[]를 사용해야 한다.

        /*
        int와 Integer는 같지 않다
        같은 정수 타입을 사용하긴 하나 int는 primitive type. 즉, 원시적인 자료형
        Integer는 클래스로 이루어져 있으며 Wrapper class
        같은 정수지만 int는 연산만 가능한 반면 Integer는 다양한 기능을 사용할 수 있다.
        double - Double
        float - Float
        long - Long 등등
         */

        // 평균 구하기
        int[] score = {100,88,100,100,90};
        int sum = 0;
        float average = 0F;
        for (int num : score) {
            sum += num;
        }
        average = ((float) sum) / ((float) score.length);
        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+average);

        // 최대 최솟값 구하기
        int[] score2 = {79,88,91,33,100,55,95};
        int max = -1;
        int min = 101;

        // for (int num : score2) {
        //     max = Math.max(num, max);
        //     min = Math.min(num, min);
        // }

        for (int num : score2) {
            max = (max < num) ? num : max;
            min = (min > num) ? num : min;
        }
        System.out.println("최대 : "+max);
        System.out.println("최소 : "+min);

        // 요일 출력
        char[] week = {'월','화','수','목','금','토','일'};

        // 1~7까지의 숫자를 입력받아서 요일을 출력하도록
        // 범위를 벗어나면 "잘못 입력하셨습니다" 출력
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num>0 && num<8) {
            System.out.println(week[num - 1]);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        // 값 target이 처음 나타나는 인덱스를 찾고, 없으면 -1을 출력하기
        // 찾을 target은 1~10까지 입력받기
        int[] a = {4,2,7,2,3,7,4};
        int index = -1;
        int target = scan.nextInt();
        for (int i=0; i<a.length; i++) {
            if (a[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
