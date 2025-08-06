package app.hinabi.hinabi.mapper;

import app.hinabi.hinabi.dto.ActivityDTO;
import app.hinabi.hinabi.model.Activity;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {GoalMapper.class, ActivityMetricMapper.class})
public interface ActivityMapper {
    @Mapping(target = "goals", source = "goal")
    ActivityDTO toDto(Activity activity);

    @Mapping(target = "goal", source = "goals")
    Activity toEntity(ActivityDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(ActivityDTO dto, @MappingTarget Activity activity);
}
