package shahzayb.vuquizdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import shahzayb.vuquizdemo.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {
    User findByUsername(String username);
}
