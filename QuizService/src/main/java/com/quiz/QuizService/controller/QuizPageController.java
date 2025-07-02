package com.quiz.QuizService.controller;

import com.quiz.QuizService.entities.Question;
import com.quiz.QuizService.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QuizPageController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/quizzes")
    public String quizzesPage(Model model) {
        model.addAttribute("quizzes", quizService.get());
        return "quizzes";
    }

    // File: src/main/java/com/quiz/QuizService/controller/QuizPageController.java

    @GetMapping("/quizzes/{id}/questions")
    public String quizQuestionsPage(@PathVariable Long id, Model model) {
        List<Question> questions = quizService.getQuestionsByQuizId(id);
        model.addAttribute("questions", questions);
        model.addAttribute("quizId", id);
        return "quiz-questions";
    }
}