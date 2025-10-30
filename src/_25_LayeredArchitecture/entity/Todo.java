package _25_LayeredArchitecture.entity;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Todo {
    private int todoId;
    private String contents;
    private User user;
    private LocalDateTime createDt;
}
