package shahzayb.vuquizdemo.repository;

import org.springframework.data.repository.Repository;

import shahzayb.vuquizdemo.entity.User;

public interface UserRepository extends Repository<User, Long> {
    User findByUsername(String username);

    void deleteAll();

    void save(User user);
}
