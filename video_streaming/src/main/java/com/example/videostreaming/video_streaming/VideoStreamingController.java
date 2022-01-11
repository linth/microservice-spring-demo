package com.example.videostreaming.video_streaming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoStreamingController {
    @GetMapping("")
    public String videostreaming() {
        return "This is an Video streaming page.";
    }
}
