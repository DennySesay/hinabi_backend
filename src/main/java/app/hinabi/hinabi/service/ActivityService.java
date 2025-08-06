package app.hinabi.hinabi.service;

import app.hinabi.hinabi.dto.ActivityDTO;
import app.hinabi.hinabi.mapper.ActivityMapper;
import app.hinabi.hinabi.model.Activity;
import app.hinabi.hinabi.repository.ActivityRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private final ActivityRepository activityRepository;
    private final ActivityMapper activityMapper;

    public ActivityDTO createActivity(ActivityDTO dto) {
        Activity activity = activityMapper.toEntity(dto);
        Activity saved = activityRepository.save(activity);
        return activityMapper.toDto(saved);
    }

    public ActivityDTO updateActivity(UUID id, ActivityDTO dto) {
        Activity activity = activityRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Activity not found"));
        
        activityMapper.updateEntityFromDto(dto, activity);
        Activity updated = activityRepository.save(activity);
        return activityMapper.toDto(updated);
    }
}
