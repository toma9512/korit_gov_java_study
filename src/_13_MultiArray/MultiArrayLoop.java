package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][]
                {
                        {"A1","A2","A3","A4","A5"},
                        {"B1","B2","B3","B4","B5"},
                        {"C1","C2","C3","C4","C5"}
                };

        // for (int i=0; i<3; i++) { // 행
        //     for (int j=0; j<5; j++) { // 열
        //         System.out.print(seats[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for (int i=0; i<seats.length; i++) {
            for (int j=0; j<seats[i].length; j++) {
                System.out.print(seats[i][j]+" ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i=0; i<seats2.length; i++) {
            for (int j=0; j<seats2[i].length; j++) {
                System.out.print(seats2[i][j]+" ");
            }
            System.out.println();
        }

        // 아이맥스 영화관
        // 세로 10칸, 가로 15칸
        String[][] imaxSeats = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};

        // for (int i=0; i<eng.length; i++) {
        //     for (int j=0; j<imaxSeats[i].length; j++) {
        //         imaxSeats[i][j] = eng[i]+(j+1);
        //     }
        // }

        for (int i=0; i<eng.length; i++) {
            for (int j=0; j<imaxSeats[i].length; j++) {
                imaxSeats[i][j] = String.valueOf((char)('A'+i)) + (j+1);
            }
        }

        imaxSeats[3][7] = "__";
        imaxSeats[5][3] = "__";
        imaxSeats[7][5] = "__";
        imaxSeats[7][6] = "__";

        for (int i=0; i<eng.length; i++) {
            for (int j=0; j<imaxSeats[i].length; j++) {
                System.out.print(imaxSeats[i][j]+" ");
            }
            System.out.println();
        }

        // 다차원 배열 합 구하기
        // 3x3크기 1부터 홀수 차례대로 넣고 출력해서 확인 후 총합 구하기
        int[][] arr = new int[4][5];
        int sum = 0;
        int n = arr[0].length;

        for (int i=0; i<arr.length*n; i++) {
            arr[i/n][i%n] = i*2+1;

            System.out.print(arr[i/n][i%n] + " ");
            if (i%n==n-1) System.out.println();

            sum += arr[i/n][i%n];
        }
        System.out.println("총합 : "+sum);
        System.out.println(Arrays.deepToString(arr));

        // 각 행 합, 각 열 합, 전체 합
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[] row = new int[a.length];
        int[] col = new int[a[0].length];
        int totalSum = 0;

        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                totalSum += a[i][j];
                row[i] += a[i][j];
                col[j] += a[i][j];
            }
        }
        System.out.println("각 행의 합 : " + Arrays.toString(row));
        System.out.println("각 열의 합 : "+Arrays.toString(col));
        System.out.println("총합 : " + totalSum);

        // A+B, A-B 값 구하기
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{5,6},{7,8}};

        int[][] add = new int[2][2];
        int[][] sub = new int[2][2];

        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[i].length; j++) {
                add[i][j] = A[i][j] + B[i][j];
                sub[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("A+B : " + Arrays.deepToString(add));

        System.out.println("A-B : " + Arrays.deepToString(sub));
    }
}
