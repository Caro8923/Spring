package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    //localhost:8080 three languages to work on
//    @GetMapping
//    @ResponseBody
//    public String skillsMessage(){
//        return "<html>" +
//                "<body>" +
//                "<h1>Skills Tracker</h1>" +
//                "<h2>We have a few skills we would like to learn. Here is the list</h2>" +
//                "<ol>" +
//                "<li>Java</li>" +
//                "<li>JavaScript</li>" +
//                "<li>Python</li>" +
//                "</ol>" +
//                "</body>" +
//                "<html>";
//    }

    //part 2

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='/' method='post'>" + //submit a request to /hello
                    "<div>" +
                    "<label>Name: <input type='text' name='name'></label>" +
                    "</div>" +
                    "<div>" +
                        "<label>My Favorite Language <select name='skill1'>" +
                            "<option value='Java' selected>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select></label>" +
                    "</div>" +
                    "<div>" +
                    "<label>My Second Favorite Language <select name='skill2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Javascript' selected>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select></label>" +
                    "</div>" +
                    "<div>" +
                    "<label>My Third Favorite Language <select name='skill3'>" +
                        "<option value='Java' >Java</option>" +
                        "<option value='Javascript'>JavaScript</option>" +
                        "<option value='Python' selected>Python</option>" +
                    "</select></label>" +
                    "</div>" +
                "<div>" +
                "<input type='submit' value='Submit!'>" +
                "</div>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

   // part 3

    @PostMapping
    @ResponseBody
        public String skillsMessage(@RequestParam String name, @RequestParam String skill1, @RequestParam String skill2, @RequestParam String skill3){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" + name + "</h2>" +
                "<ol>" +
                "<li>" +skill1+ "</li>" +
                "<li>" +skill2+ "</li>" +
                "<li>" +skill3+ "</li>" +
                "</ol>" +
                "</body>" +
                "<html>";
    }
}
