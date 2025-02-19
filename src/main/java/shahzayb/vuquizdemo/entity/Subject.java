package shahzayb.vuquizdemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String subjectCode;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public Subject() {
    }

    public Subject(Long id, String title, String subjectCode) {
        this.id = id;
        this.title = title;
        this.subjectCode = subjectCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
