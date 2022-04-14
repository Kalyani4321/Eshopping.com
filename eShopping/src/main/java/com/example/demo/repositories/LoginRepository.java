package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;
import com.example.demo.entities.LoginInfo;
@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

	 @Query("select l from Login l where l.useremail like %?1 and l.password like %?2")
	 public Login getInfoByNameAndPassword(String useremail,String password);
	 /*
	 @Query("update login set password= ?1 where useremail=?2")
	 public void changePassword(String password,String useremail);
	 @Query("select l.password from login l where useremail=?1")
	 public String checkPassword(String useremail);
	 */
	 
	 
}
