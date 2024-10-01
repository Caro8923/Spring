package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

//    //handles requests at path /hello
//    @GetMapping("hello")
//    public String hello() {
//        return "Hello, Spring!";
//    }
//
//    //handles requests at path /goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }

    //Handles request of the form /hello?name=LaunchCode
    //accepts both get and post requests
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
//    public String helloWithQueryParam(@RequestParam String name){
//        return "Hello," + name + "!";
//    }
//
//    //Handles request of the form /hello/LaunchCode
//    @GetMapping("hello/{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello," + name + "!";
//    }

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


    //Exercises
    //form post request at /hello/form
    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                    "<body>" +
                        "<form action='/hello' method='post'>" + //submit a request to /hello
                            "<input type='text' name='name'>" +
                                "<select name='language'>" +
                                    "<option value='english' selected>English</option>" +
                                    "<option value='french'>French</option>" +
                                    "<option value='german'>German</option>" +
                                    "<option value='italian'>Italian</option>" +
                                    "<option value='spanish'>Spanish</option>" +
                                "</select>" +
                            "<input type='submit' value='Greet me!'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }

        return createMessage(name, language);
    }

    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("english")) {
            greeting = "Hello";
        }
        else if (l.equals("french")) {
            greeting = "Bonjour";
        }
        else if (l.equals("italian")) {
            greeting = "Bonjourno";
        }
        else if (l.equals("spanish")) {
            greeting = "Hola";
        }
        else if (l.equals("german")) {
            greeting = "Hallo";
        }

        return greeting + " " + n;
    }
}

