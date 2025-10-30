package _25_LayeredArchitecture.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Todo {
    private int todoId;
    private String contents;
    private User user;
    private LocalDateTime createDt;
}
