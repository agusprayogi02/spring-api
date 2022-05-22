package com.smk.modul1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<Hello> getHello() {
        return ResponseEntity.ok(new Hello());
    }

    @PostMapping
    public ResponseEntity<Hello> postHello() {
        Hello hello = new Hello();
        hello.setHello("post world");
        return ResponseEntity.ok(hello);
    }

    @DeleteMapping
    public void deleteHello() {
    }

    @PutMapping
    public ResponseEntity<Hello> putHello() {
        Hello hello = new Hello();
        hello.setHello("put world");
        return ResponseEntity.ok(hello);
    }
}