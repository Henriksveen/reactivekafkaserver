package no.safebase.reactivekafkaserver;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
    private String type;
    private String message;
}
