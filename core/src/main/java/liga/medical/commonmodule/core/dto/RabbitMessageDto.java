package liga.medical.commonmodule.core.dto;

import liga.medical.commonmodule.core.enums.MessageType;
import lombok.Data;

@Data
public class RabbitMessageDto {
    private Long id;
    private MessageType messageType;
    private String description;
}
