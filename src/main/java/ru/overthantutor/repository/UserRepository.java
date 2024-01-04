package ru.overthantutor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.overthantutor.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
