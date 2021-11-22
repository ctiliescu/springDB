package com.mobile.academy.users.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<com.mobile.academy.users.user.service.repository.UserDao, Integer> {

}
