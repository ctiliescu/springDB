package com.mobile.academy.users.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<com.mobile.academy.users.user.service.repository.UserDao, Integer> {

    Optional<UserDao> findByLastName(String lastName);

    @Query(value = "select * from users u where u.last_name = ?1", nativeQuery = true)
    UserDao findByLaaastName(String lastName);
}
