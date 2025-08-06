package app.hinabi.hinabi.repository;

import app.hinabi.hinabi.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, UUID> {
    // Find activities by type
    List<Activity> findByType(String type);
    
    // Find activities with a specific metric
    @Query("SELECT a FROM Activity a JOIN a.metrics m WHERE m.metricKey = :key AND m.numericValue >= :value")
    List<Activity> findByNumericMetricGreaterThan(String key, Double value);
    
    // Find activities within the date range
    List<Activity> findByDateBetween(LocalDateTime start, LocalDateTime end);
}
