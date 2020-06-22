package br.com.armandoalmeida.requestHeaderNonNull.controller;

import br.com.armandoalmeida.requestHeaderNonNull.controller.validation.RequestHeaderNonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/")
    public String getSomething(@RequestHeader("X-Required-Header") @RequestHeaderNonNull String xRequiredHeader) {
        return "X-Required-Header: " + xRequiredHeader;
    }

}
