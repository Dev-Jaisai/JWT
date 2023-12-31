package com.springsecurity.repository;

import com.springsecurity.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    boolean existsByUsername(String username);

    Optional<AppUser> findByUsername(String username);
}
