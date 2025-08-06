package app.hinabi.hinabi.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class GoalDTO {
    private UUID id;
    private String title;
    private String description;
    private LocalDate targetDate;
    private boolean achieved;
}
