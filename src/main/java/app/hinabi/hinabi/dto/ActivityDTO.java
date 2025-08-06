package app.hinabi.hinabi.dto;

import app.hinabi.hinabi.model.Goal;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
public class ActivityDTO {
    private UUID id;
    private LocalDate date;
    private String activityType;
    private int duration;
    private String notes;
    private List<Goal> goals;
    private List<MetricDTO> metrics;
}
