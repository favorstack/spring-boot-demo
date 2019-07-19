package io.favorstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 第一个Boot应用，Hello World 示例
 * <p>
 * Version		1.0.0
 *
 * @author lin
 * <p>
 * Date	      2019-07-19 14:57
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
