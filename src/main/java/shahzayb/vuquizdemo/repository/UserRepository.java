package shahzayb.vuquizdemo.repository;

import org.springframework.data.repository.Repository;
import shahzayb.vuquizdemo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {
    User findByUsername(String username);

    void deleteAll();

    void save(User user);

    List<User> findAll();

    Optional<User> findById(Long id);

    void delete(User user);
}
