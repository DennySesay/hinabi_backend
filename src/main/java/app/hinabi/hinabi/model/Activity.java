package app.hinabi.hinabi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate date;
    private String title;
    private String description;
    private String activityType;
    private double duration;
    private String notes;
    private String startDate;
    private String endDate;

    @OneToMany
    private List<Goal> goal;

    @OneToMany
    private List<ActivityMetric> metrics = new ArrayList<>();
}
