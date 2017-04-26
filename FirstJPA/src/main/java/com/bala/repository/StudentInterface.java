package com.bala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bala.model.User;

public interface StudentInterface extends JpaRepository<User, Long> {

	@Query(value = "select * from users where email=?1 and password=?2", nativeQuery = true)
	public User findByEmailAndPassword(String emailId, String password);

}
