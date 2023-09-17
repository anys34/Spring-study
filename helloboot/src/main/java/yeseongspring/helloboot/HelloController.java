package yeseongspring.helloboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    // @RequestMapping(value = "/hello", method = RequestMethod.GET);
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
