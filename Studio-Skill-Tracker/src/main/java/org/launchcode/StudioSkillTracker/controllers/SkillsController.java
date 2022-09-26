package org.launchcode.StudioSkillTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    //You need to have an h1 with the title "Skills Tracker", an h2, and an ol containing
    // three programming languages of your choosing.
    @GetMapping
    @ResponseBody
    public String createMainPage(){
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
    public String createForm(){
        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post'>" +
                "<label><b> Name: <br><input type='text' name= 'name'></label><br>" +
                "<label><b> My favorite language: </label><br>" +
                "<select name='My first-language' id='first-language'>"+
                "<option value='java'>Java</option>"+
                "<option value='javascript'>Javascript</option>"+
                "<option value='python'>Python</option>"+
                "</select>"+
                "<label><b><br> My Second favorite language: </label><br>" +
                "<select name='second-language' id='second-language'>"+
                "<option value='java'>Java</option>"+
                "<option value='javascript'>Javascript</option>"+
                "<option value='python'>Python</option>"+
                "</select>" +
                "<label><b><br> My Third favorite language: </label><br>" +
                "<select name='third-language' id='third-language'>"+
                "<option value='java'>Java</option>"+
                "<option value='javascript'>Javascript</option>"+
                "<option value='python'>Python</option>"+
                "</select>" +
                "<br><input type='submit', value='Submit'><br>" +
                "</form>" + "</body>" + "</html>";


    }
    }

