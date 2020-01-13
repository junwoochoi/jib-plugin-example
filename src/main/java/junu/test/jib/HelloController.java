package junu.test.jib;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok(Stream.of("hello").collect(toMap(key -> key, val -> "world")));
    }
}
