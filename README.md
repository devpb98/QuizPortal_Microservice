# Quiz Portal

A microservices-based Quiz Portal built with Spring Boot and Maven.

## Project Structure

- `QuizService/` - Handles quizzes and communicates with QuestionService to fetch questions for each quiz.
- `QuestionService/` - Manages questions and exposes REST APIs for CRUD operations and fetching questions by quiz.
- `ServiceRegistry/` - (Optional) Service registry for service discovery (e.g., Eureka).

## Technologies

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- REST APIs
- Thymeleaf (for UI in QuizService)

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven

### Build All Services

From the root directory, run: **mvn clean install**

### Running Services

Open separate terminals for each service and run:

**cd ServiceRegistry mvn spring-boot:run**

**cd QuestionService mvn spring-boot:run**

**cd QuizService mvn spring-boot:run**

### Accessing the Application

- QuizService UI: [http://localhost:8080/quizzes](http://localhost:8080/quizzes)
- QuestionService API: [http://localhost:8081/question](http://localhost:8081/question)

(Ports may vary based on your configuration.)

## API Endpoints

### QuestionService

- `POST /question` - Create a new question
- `GET /question` - Get all questions
- `GET /question/{id}` - Get question by ID
- `GET /question/quiz/{quizId}` - Get questions by quiz ID

### QuizService

- `GET /quizzes` - List all quizzes
- `GET /quizzes/{id}/questions` - List questions for a quiz

## License

This project is for educational purposes.
