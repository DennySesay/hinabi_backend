package app.hinabi.hinabi.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class MetricDTO {
    private UUID id;
    private String key;
    private ValueType valueType;
    private String stringValue;
    private Double numericValue;
    private Boolean booleanValue;
    private Object complexValue;
}
