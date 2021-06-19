package com.spring.demoeventapp.util;


import com.spring.demoeventapp.model.EventType;
import java.util.Map;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Created by Bloo
 * @Date: 2021/06/19
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileEvent {
    private String eventId;
    private EventType type;
    private Map<String, ?> data;

    /**
     * Event Success
     */
    public static FileEvent toCompleteEvent( Map data ) {
        return FileEvent.builder()
            .eventId(UUID.randomUUID().toString())
            .type(EventType.COMPLETE)
            .data(data)
            .build();

    }


    /**
     * Event Success
     */
    public static FileEvent toErrorEvent( Map data ) {
        return FileEvent.builder()
            .eventId(UUID.randomUUID().toString())
            .type(EventType.ERROR)
            .data(data)
            .build();
    }

}
