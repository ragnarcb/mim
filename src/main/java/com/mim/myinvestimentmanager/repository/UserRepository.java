package com.mim.myinvestimentmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mim.myinvestimentmanager.model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
    
}
