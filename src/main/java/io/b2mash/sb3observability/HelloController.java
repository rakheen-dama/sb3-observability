package io.b2mash.sb3observability;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final RestTemplate restTemplate;

    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Go away!";
    }

    @GetMapping("/traceme")
    public String traceMe() {
        ResponseEntity<String> responseEntity = this.restTemplate.postForEntity("https://httpbin.org/post", "Testing a trace!", String.class);
        return responseEntity.getBody();
    }
}
