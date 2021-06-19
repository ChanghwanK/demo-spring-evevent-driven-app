package com.spring.demoeventapp.controller;

import com.spring.demoeventapp.service.FileService;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by Bloo
 * @Date: 2021/06/19
 */

@RequiredArgsConstructor
@RequestMapping("/api/event")
@RestController
public class ApiEventController {

    private final FileService fileService;

    @GetMapping("/upload/image")
    public ResponseEntity<?> fileUpload() {
        Map<String, Object> data = new HashMap<>();
        data.put("userId", "홍길동");
        data.put("type", "webp");
        data.put("fileSzie", 5);

        fileService.fileUpload(data);
        return ResponseEntity.ok("Success");
    }
}
