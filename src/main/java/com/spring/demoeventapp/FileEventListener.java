package com.spring.demoeventapp;

import com.spring.demoeventapp.util.FileEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Created by Bloo
 * @Date: 2021/06/19
 */

@Slf4j
@Component
public class FileEventListener {

    /**
     * 스프링 이벤트를 별도의 이벤트 관련 클래스를 상속 받지 않아도 스프링 이벤트를 받을 수 있다.
     *
     * 파일 처리가 완료된 시점에 데이터를 받아서 다른 API 서버 혹은 DB Server 에 보내거나 Insert 가 가능해진다.
     */
    @EventListener
    public void onFileEventHandler( FileEvent fileEvent ) {
        log.info("file Event receive type {} data {}", fileEvent.getType(), fileEvent.getData());
    }
}
