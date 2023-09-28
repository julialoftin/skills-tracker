package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String renderHomePage() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Skills to learn</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String renderForm() {
        return "<form method='post' action='/form'>" +
                "<label for='name'>Name:</label>" + "<br>" +
                "<input name='name'>" + "<br>" +
                "<label for='firstFavorite'>First Favorite:</label>" + "<br>" +
                "<select name='firstFavorite'>" + "<br>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br>" +
                "<label for='secondFavorite'>Second Favorite:</label>" + "<br>" +
                "<select name='secondFavorite'>" + "<br>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<br>" +
                "<label for='thirdFavorite'>Third Favorite:</label>" + "<br>" +
                "<select name='thirdFavorite'>" + "<br>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" + "<br>" +
                "</select>" + "<br>" +
                "<button type='submit'>Submit</button" +
                "</form>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String renderCompletedForm(@RequestParam String name, @RequestParam String firstFavorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstFavorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>";
    }
}
