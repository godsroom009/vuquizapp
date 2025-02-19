package shahzayb.vuquizdemo.entity;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Document
@Getter
@Setter
public class Quiz {
    @Id
    private Long id;
    private Instant instant = Instant.now();
    private Integer result = 0;
    private Integer totalMarks;

    @Transient
    private Integer curQuestionNumber = 1;

    @Transient
    private List<Question> questions;

    private User user;

    private Subject subject;

    public Quiz() {
    }

    public Quiz(Long id, Instant instant, Integer result, Integer totalMarks, Integer curQuestionNumber, List<Question> questions, User user, Subject subject) {
        this.id = id;
        this.instant = instant;
        this.result = result;
        this.totalMarks = totalMarks;
        this.curQuestionNumber = curQuestionNumber;
        this.questions = questions;
        this.user = user;
        this.subject = subject;
    }

    public void addResult(Integer result) {
        if (this.result == null) {
            this.result = result;
        } else {
            this.result += result == null ? 0 : result;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setCurQuestionNumber(Integer curQuestionNumber) {
        this.curQuestionNumber = curQuestionNumber;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Instant getInstant() {
        return instant;
    }

    public Integer getResult() {
        return result;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public Integer getCurQuestionNumber() {
        return curQuestionNumber;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public User getUser() {
        return user;
    }

    public Subject getSubject() {
        return subject;
    }

    public Question getCurrentQuestion() {
        return questions.get(curQuestionNumber - 1);
    }

//    @PrePersist
//    public void calculateTotalMarks() {
//        totalMarks = questions.stream().mapToInt(Question::getTotalMarks).sum();
//    }

}
