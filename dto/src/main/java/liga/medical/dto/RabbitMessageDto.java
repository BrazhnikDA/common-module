package liga.medical.dto;

import lombok.Data;

@Data
public class RabbitMessageDto {
    MessageType messageType;
    String content;
}
