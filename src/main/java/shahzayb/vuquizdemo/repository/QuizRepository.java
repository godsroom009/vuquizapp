package shahzayb.vuquizdemo.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import shahzayb.vuquizdemo.entity.Quiz;
import shahzayb.vuquizdemo.entity.User;

import java.util.List;

public interface QuizRepository extends MongoRepository<Quiz, Long> {
    List<Quiz> getByUser(User user, Sort sort);

    Quiz save(Quiz quiz);

    void deleteById(Long id);
}
