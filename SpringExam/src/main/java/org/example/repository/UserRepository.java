package org.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<Employee> extends JpaRepository<Employee, Long> {

}

