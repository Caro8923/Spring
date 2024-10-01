package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    //handles requests at path /hello
    @GetMapping("hello")
    public String hello() {
        return "Hello, Spring!";
    }

    //handles requests at path /goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //Handles request of the form /hello?name=LaunchCode
    //accepts both get and post requests
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello," + name + "!";
    }

    //Handles request of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello," + name + "!";
    }

//    //form get request at /hello/form
//    @GetMapping("form")
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action='hello'>" + //submit a request to /hello
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet me!'" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }

    //form post request at /hello/form
    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }
}

