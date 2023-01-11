package org.lecture.lecture8.homeWorkQuiz.question;

import org.lecture.lecture8.homeWorkQuiz.question.answer.Answer;
import org.lecture.lecture8.homeWorkQuiz.question.answer.ConsoleAnswerManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleQuestionManager implements QuestionManager {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Question> questions = new ArrayList<>();
    private final ConsoleAnswerManager answerManager = new ConsoleAnswerManager();

    @Override
    public void showMenu() {
        int response = -1;
        while (response != 0) {
            System.out.println("1 - create new question");
            System.out.println("2 - edit question");
            System.out.println("3 - create new answer");
            System.out.println("4 - edit answer");
            System.out.println("5 - drop question");
            System.out.println("6 - drop answer");
            System.out.println("0 - return in menu");

            response = scannerInt();
            switch (response) {
                case 1 -> createQuestion();
                case 2 -> editQuestion();
                case 3 -> createAnswer();
                case 4 -> editAnswers();
                case 5 -> dropQuestion();
                case 6 -> dropAnswer();
            }
        }
    }

    @Override
    public void showQuestion() {
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question №: " + (i + 1) + " " + questions.get(i));
        }
    }

    @Override
    public void showAnswer(Question question) {
        List<Answer> answers = question.getAnswers();
        for (int i = 0; i < answers.size(); i++) {
            System.out.println("Answer №: " + (i + 1) + " " + answers.get(i));
        }
    }

    @Override
    public Question createQuestion() {
        System.out.println("Enter you question");
        String questionName = scannerStr();
        List<Answer> answers = new ArrayList<>();
        answers.add(answerManager.create());
        while (true) {
            System.out.println("Press");
            System.out.println("1 - create another answer");
            int response = scannerInt();
            if (response == 1) {
                answers.add(answerManager.create());
            } else {
                break;
            }
        }
        Question question = new Question(questionName, answers);
        System.out.println("Enter the number of the correct answer");
        selectAnswer(question).setCorrect();
        add(question);
        return question;
    }

    @Override
    public void dropQuestion() {
        showQuestion();
        Question question = selectQuestion();
        questions.remove(question);
    }

    @Override
    public void dropAnswer() {
        showQuestion();
        Question question = selectQuestion();
        List<Answer> answers = question.getAnswers();
        showAnswer(question);
        Answer answer = selectAnswer(question);
        answers.remove(answer);
        question.setAnswers(answers);
    }

    @Override
    public void editQuestion() {
        Question question = selectQuestion();
        String response = scannerStr();
        question.setQuestion(response);
    }

    public void createAnswer() {
        Question question = selectQuestion();
        Answer answer = answerManager.create();
        question.add(answer);
        }

    @Override
    public boolean isQuestion() {
        return questions.size() != 0;
    }

    public void editAnswers() {
        Question question = selectQuestion();
        Answer answer = selectAnswer(question);
        System.out.println("Enter edit answer");
        String response = scannerStr();
        answer.setAnswer(response);
    }

    @Override
    public Question selectQuestion() {
        showQuestion();
        System.out.println("Enter question number");
        int response = scannerInt();
        return questions.get(response - 1);
    }

    @Override
    public Answer selectAnswer(Question question) {
        showAnswer(question);
        System.out.println("Enter answer number");
        int response = scannerInt();
        return question.getAnswers().get(response - 1);
    }
    @Override
    public void add(Question question) {
        questions.add(question);
    }

    private String scannerStr() {
        return scanner.nextLine();
    }

    private int scannerInt() {
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }
}