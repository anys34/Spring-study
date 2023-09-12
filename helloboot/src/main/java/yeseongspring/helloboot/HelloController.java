package yeseongspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@RequestMapping("hello")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    @ResponseBody
    // @RequestMapping(value = "/hello", method = RequestMethod.GET);
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
