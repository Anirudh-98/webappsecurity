package com.websecurity.webappsecurity.repo;

import com.websecurity.webappsecurity.domain.Attempts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttemptsRepository extends JpaRepository<Attempts, Integer> {

    Optional<Attempts> findAttemptsByUsername(String username);
}
