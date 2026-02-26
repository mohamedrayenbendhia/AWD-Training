package esprit.notification;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mic4/notification")
public class NotificationRESTapi {
    @GetMapping("/hello")
    public String hello() {
        return "Hello I am Mic4";
    }
}
