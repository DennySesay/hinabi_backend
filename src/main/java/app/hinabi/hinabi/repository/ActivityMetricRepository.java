package app.hinabi.hinabi.repository;

import app.hinabi.hinabi.model.ActivityMetric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ActivityMetricRepository extends JpaRepository<UUID, ActivityMetric> {
}
