package com.zzq.springbootNote.controller;

import com.zzq.springbootNote.pojo.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


/**
 * @author qq1036916439
 */
@RestController
public class TestController {
    @PostMapping("/post")
    public String test(@Valid @RequestBody Student student) {
        //System.out.println(+"1212312");
        return student.toString();
    }
}
