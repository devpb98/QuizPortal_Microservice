package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question createQuestion(Question question);

    Question getQuestionById(Long questionId);

    List<Question> getAllQuestions();
}
