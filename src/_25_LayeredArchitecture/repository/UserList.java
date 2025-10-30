package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    private User[] users;

    public UserList() {
        this.users = new User[0];
    }

    public User[] getAllUser() {
        return users;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public int generateUserId() {
        // 만약 배열에 아무것도 없으면 1반환
        // 있으면 마지막 user객체의 userId에 +1한 결과값을 반환
        return (users.length==0) ? 1 : users[users.length-1].getUserId()+1;
    }

    public void add(User user) {
        // 새로 넣을 배열 -> 길이가 원래 있던 배열 길이에서 +1
        User[] temp = new User[users.length+1];
        // 새로 넣을 배열에 원래 있던 요소들을 먼저 추가
        for (int i=0; i<users.length; i++) {
            temp[i] = users[i];
        }
        // 새로 추가할 user를 넣어야 함
        temp[temp.length-1] = user;
        // users에 있던 배열에서 새로운 배열로 바꾸기
        users = temp;
    }
}
