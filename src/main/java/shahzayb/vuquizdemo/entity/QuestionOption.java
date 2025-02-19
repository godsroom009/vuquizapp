package shahzayb.vuquizdemo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class QuestionOption {
    @Id
    private Long id;
    private String questionOption;

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
