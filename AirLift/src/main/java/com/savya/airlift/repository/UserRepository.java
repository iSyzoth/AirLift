package com.savya.airlift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.savya.airlift.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
