package com.spring.demoeventapp.service;

import com.spring.demoeventapp.util.FileEvent;
import com.spring.demoeventapp.util.FileEventPublisher;
import java.io.File;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Created by Bloo
 * @Date: 2021/06/19
 */

@Slf4j
@RequiredArgsConstructor
@Service
public class FileService {

    private final FileEventPublisher eventPublisher;

    public void fileUpload( Map<String, Object> data) {

        try {
            log.info("file upload success");
            log.info("DB 에 파일 META INFO 저장 완료:");
            eventPublisher.notifyComplete(FileEvent.toCompleteEvent(data));
        } catch ( Exception e ) {
            log.error("file upload fail");
            eventPublisher.notifyError(FileEvent.toErrorEvent(data));
        }

    }
}
