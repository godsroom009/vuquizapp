package shahzayb.vuquizdemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private Integer totalMarks;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<QuestionOption> questionOptions;

    @OneToOne
    @JoinColumn(name = "correct_answer")
    private QuestionOption CorrectAnswer;

    @ManyToOne
    @JoinColumn(name = "subject")
    private Subject subject;

    public Question() {
    }

    public Question(Long id, String question, Integer totalMarks, List<QuestionOption> questionOptions, QuestionOption CorrectAnswer, Subject subject) {
        this.id = id;
        this.question = question;
        this.totalMarks = totalMarks;
        this.questionOptions = questionOptions;
        this.CorrectAnswer = CorrectAnswer;
        this.subject = subject;
    }

    public QuestionOption getCorrectAnswer() {
        return this.CorrectAnswer;
    }

    public void setCorrectAnswer(QuestionOption CorrectAnswer) {
        this.CorrectAnswer = CorrectAnswer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setQuestionOptions(List<QuestionOption> questionOptions) {
        this.questionOptions = questionOptions;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public List<QuestionOption> getQuestionOptions() {
        return questionOptions;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public String getQuestion() {
        return question;
    }

    public Long getId() {
        return id;
    }
}
