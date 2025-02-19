package shahzayb.vuquizdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import shahzayb.vuquizdemo.entity.Subject;

public interface SubjectRepository extends MongoRepository<Subject, Long> {
    Subject getSubjectBySubjectCode(String subjectCode);
}
