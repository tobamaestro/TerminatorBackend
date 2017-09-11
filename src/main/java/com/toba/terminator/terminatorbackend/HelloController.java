package com.toba.terminator.terminatorbackend;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Api(produces = MediaType.TEXT_PLAIN_VALUE, value = "Hello World Controller!")
public class HelloController {


    @GetMapping
    @ApiOperation(value = "Hello World!", produces = MediaType.TEXT_PLAIN_VALUE, code = 200)
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("hey there", HttpStatus.OK);
    }


}
