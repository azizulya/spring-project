package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/another")
public class AnotherController {

    @RequestMapping("/list")     // localhost:8080/another/list
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",45, Gender.M));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.M));
        mentorList.add(new Mentor("Ammy","Bryan",25, Gender.F));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";


    }
}
