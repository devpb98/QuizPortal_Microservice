package com.quiz.QuizService.controller;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {


    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return quizService.addQuiz(quiz);
    }

    @GetMapping
    public List<Quiz> get() {
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id) {
        return quizService.get(id);
    }

}
