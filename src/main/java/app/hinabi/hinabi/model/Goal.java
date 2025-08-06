package app.hinabi.hinabi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private LocalDate targetDate;
    private boolean achieved;
    private String startDate;
    private String endDate;
    private int currentStreak;
    private int longestStreak;

    @OneToMany
    private List<Activity> activities;
}
