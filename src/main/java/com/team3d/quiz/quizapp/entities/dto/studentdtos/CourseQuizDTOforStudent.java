package com.team3d.quiz.quizapp.entities.dto.studentdtos;

import com.team3d.quiz.quizapp.entities.dto.QuestionDTOForShow;

import java.util.List;

public class CourseQuizDTOforStudent {

    private String title;
    private String desc;
    private double time;

    private List<QuestionDTOforStudent> questions;

    public CourseQuizDTOforStudent(String title, String desc, double time, List<QuestionDTOforStudent> questions) {
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.questions = questions;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public double getTime() {
        return time;
    }

    public List<QuestionDTOforStudent> getQuestions() {
        return questions;
    }
}
