package com.team3d.quiz.quizapp.controllers.StudentControllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PreAuthorize("hasRole('ROLE_STUDENT')")
public class StudentController {

    @GetMapping("/Student")
    public String getStudentHomePage(){
        return "Students/StudentHomePage";
    }
}