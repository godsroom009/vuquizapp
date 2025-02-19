package shahzayb.vuquizdemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class QuestionOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String questionOption;

    @ManyToOne
    @JoinColumn(name = "question")
    private Question question;

    public Long getId() {
        return id;
    }

    public String getQuestionOption() {
        return questionOption;
    }

    public Question getQuestion() {
        return question;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setQuestionOption(String questionOption) {
        this.questionOption = questionOption;
    }
}
