package _25_LayeredArchitecture.dto;

import _25_LayeredArchitecture.entity.Todo;
import _25_LayeredArchitecture.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class TodoRegisterReqDto {
    private String contents;
    private User user;

    public Todo toEntity() {
        return Todo.builder()
                .todoId(0)
                .contents(contents)
                .user(user)
                .createDt(LocalDateTime.now())
                .build();
    }
}
