package _29_Collections.List;

/*
문제 TodoList
1. todoList를 담을 리스트 생성
2. 사용자한테 투두를 입력받을건데 몇 개 입력할건지 count변수에 입력받기
3. count만큼 반복해서 사용자에게 투두 입력받아 리스트에 추가
4. 그 다음 향상된 for문을 사용해서 할 일 목록 출력
5. 목록 출력 뒤 특정 투두의 포함여부를 확인하기 위해서 searchTodo라는 변수에 찾을
    투두 입력받기 그리고 포함여부 확인 후 출력
6. 포함 여부 확인 후 삭제할 투두를 입력받아 삭제하기
7. 투두들을 오람차순 정렬후 전체 출력
8. 내림차순 정렬 후 전체 출력
9. 전체 투두들의 갯수 출력
 */

import java.util.*;

public class TodoList {
    public static void main(String[] args) {
        // 1.
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 2.
        System.out.print("할 일 갯수 >> ");
        int count = scanner.nextInt();
        scanner.nextLine();

        // 3.
        for (int i=0; i<count; i++) {
            System.out.print((i+1) + "번째 할 일 입력 >> ");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }

        // 4.
        for (String todo : todoList) {
            System.out.println(todo);
        }

        // 5.
        System.out.print("찾을 todo 입력 >> ");
        String searchTodo = scanner.nextLine();
        boolean searchResult = todoList.contains(searchTodo);
        if (searchResult) System.out.println("포함 하고 있음");
        else System.out.println("포함하고 있지 않음");

        // 6.
        System.out.print("삭제할 todo 입력 >> ");
        String removeTodo = scanner.nextLine();
        todoList.remove(removeTodo);

        // 7.
        Collections.sort(todoList);
        System.out.println("오름차순 정렬");
        System.out.println(todoList);

        // 8.
        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println("내림차순 정렬");
        System.out.println(todoList);

        // 9.
        System.out.println("전체 갯수 : " + todoList.size());
    }
}
