package com.example.Spring.Framework.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {  // replace with ReportController

    private final StatusService statusService;

    public StatusController(StatusService statusService) { //
        this.statusService = statusService;
    }

    @GetMapping("/arrival")
    public String sayHello () {
        return statusService.processStatus(true);
    }

    @GetMapping("/departure")
    public String sayGoodbye () {
        return statusService.processStatus(false);
    }

//    @GetMapping("/arrival") // replace /arrival with /report
//    public String sayHello () {  // replace with printOutReport() method
//        return "springfundamentals/hello";  // return templates/springfundamentals/report
//    }
//
//    @GetMapping("/departure")
//    public String sayGoodbye () {
//        return "springfundamentals/goodbye";
//    }
}
