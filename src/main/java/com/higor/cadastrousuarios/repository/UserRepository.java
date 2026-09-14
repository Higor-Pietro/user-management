package com.higor.cadastrousuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.higor.cadastrousuarios.model.User;

public interface UserRepository extends JpaRepository <User, Long> {
    

}
