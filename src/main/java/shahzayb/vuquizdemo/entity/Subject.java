package shahzayb.vuquizdemo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Subject {
    @Id
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
