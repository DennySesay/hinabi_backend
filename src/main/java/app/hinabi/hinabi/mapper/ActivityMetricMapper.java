package app.hinabi.hinabi.mapper;

import app.hinabi.hinabi.dto.MetricDTO;
import app.hinabi.hinabi.model.ActivityMetric;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ActivityMetricMapper {
    MetricDTO toDto(ActivityMetric metric);
    ActivityMetric toEntity(MetricDTO dto);
}

