package com.quiz.QuizService.services;

import com.quiz.QuizService.entities.Question;
import com.quiz.QuizService.entities.Quiz;

import java.util.List;


public interface QuizService {

    Quiz addQuiz(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);


    List<Question> getQuestionsByQuizId(Long id);
}
