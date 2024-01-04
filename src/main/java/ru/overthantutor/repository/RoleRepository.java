package ru.overthantutor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.overthantutor.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
