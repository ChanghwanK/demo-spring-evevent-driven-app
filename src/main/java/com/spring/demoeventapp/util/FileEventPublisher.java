package com.spring.demoeventapp.util;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * description
 * - 파일 이벤트를 발송하는 역할
 *
 * @Created by Bloo
 * @Date: 2021/06/19
 */

@RequiredArgsConstructor
@Component
public class FileEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void notifyComplete(FileEvent fileEvent) {
        applicationEventPublisher.publishEvent(fileEvent);
    }

    public void notifyError (FileEvent fileEvent) {
        applicationEventPublisher.publishEvent(fileEvent);
    }
}
