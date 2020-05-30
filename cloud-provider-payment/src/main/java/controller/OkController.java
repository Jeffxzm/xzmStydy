package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testOk")
public class OkController {
    private Logger logger = LoggerFactory.getLogger(OkController.class);

    @GetMapping("/ok")
    public String ok(){
        return "ok";
    }
}
