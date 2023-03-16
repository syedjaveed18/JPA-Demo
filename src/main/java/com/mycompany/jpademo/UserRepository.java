package com.mycompany.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //we are making it interface because if class it has to impelements the methods of jpa
    //but here ORM framework will implements the functions of jpa i.e. hibernate
}
