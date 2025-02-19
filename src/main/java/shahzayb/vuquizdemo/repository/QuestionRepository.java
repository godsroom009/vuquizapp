package shahzayb.vuquizdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import shahzayb.vuquizdemo.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query(nativeQuery = true,
            value = "SELECT * FROM question q WHERE q.subject = :subjectId ORDER BY RAND() LIMIT total")
    List<Question> findRandomQuestionsBySubjectAndSize(
            @Param("subjectId") Long subjectId,
            @Param("total") Integer total);
}
