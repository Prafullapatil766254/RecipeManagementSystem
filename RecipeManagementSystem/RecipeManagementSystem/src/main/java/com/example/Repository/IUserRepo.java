package com.example.Repository;

import com.example.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository // not needed as those classes which implemented jpa repository already has @Repository on them so here it is optional
public interface IUserRepo extends JpaRepository<User, Integer> {
    User findFirstByEmail(String newEmail);
}
