package org.launchcode.StudioSkillTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;

@Controller
public class SkillsController {
    //You need to have an h1 with the title "Skills Tracker", an h2, and an ol containing
    // three programming languages of your choosing.
    @GetMapping
    @ResponseBody
    public String createMainPage() {
        return "<html>" + "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" + "</html>";
    }

    //At localhost:8080/form, add a form that lets the user enter their name and choose their favorite,
    // second favorite, and third favorite programming languages on your list.
    // Use select elements for each of the rankings. Just as with the exercises,
    // we will use @GetMapping()
    @GetMapping("/form")
    @ResponseBody
    public String createForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post'>" +
                "<label><b> Name: <br><input type='text' name= 'name'></label><br>" +
                "<label><b> My favorite language: </label><br>" +
                "<select name='firstlanguage' id='firstlanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label><b><br> My Second favorite language: </label><br>" +
                "<select name='secondlanguage' id='secondlanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<label><b><br> My Third favorite language: </label><br>" +
                "<select name='thirdlanguage' id='thirdlanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>Javascript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br><input type='submit', value='Submit'><br>" +
                "</form>" + "</body>" + "</html>";


    }

    @RequestMapping(value="/form", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String firstlanguage
            , @RequestParam String secondlanguage
            , @RequestParam String thirdlanguage) {
        String html = "<html>" + "<body>" +
                "<h1> {0} </h1>" +
                "<b><ol>" +
                "<li> {1} </li>" +
                "<li> {2} </li>" +
                "<li> {3} </li>" +
                "</ol></b>" +
                "</body>" + "</html>";
        return MessageFormat.format(html, name,firstlanguage, secondlanguage, thirdlanguage);
    }
}
