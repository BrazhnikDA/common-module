package liga.medical.commonmodule.core.dto;

import liga.medical.commonmodule.core.enums.SystemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
public class ExceptionDto {
    private SystemType systemType;
    private String methodParams;
}
