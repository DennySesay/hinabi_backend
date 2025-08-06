package app.hinabi.hinabi.mapper;

import app.hinabi.hinabi.dto.GoalDTO;
import app.hinabi.hinabi.model.Goal;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GoalMapper {
    GoalDTO toDto(Goal goal);
    Goal toEntity(GoalDTO dto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(GoalDTO dto, @MappingTarget Goal goal);
}
