package com.example.demoadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoadhar.entity.AdharUsers;


	@Repository
	public interface AdharUsersRepository extends JpaRepository<AdharUsers, Integer>{
		
		AdharUsers findByAge(int age);

}
