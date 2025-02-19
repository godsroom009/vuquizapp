package shahzayb.vuquizdemo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import shahzayb.vuquizdemo.entity.Question;

public interface QuestionRepository extends MongoRepository<Question, Long> {

    @Query("{ 'subject' : :#{#subjectId} }")
    List<Question> findRandomQuestionsBySubjectAndSize(
            @Param("subjectId") Long subjectId,
            @Param("total") Integer total);
}