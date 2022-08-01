package com.example.CRUDexercise.repository;

import com.example.CRUDexercise.model.Account;
import com.example.CRUDexercise.model.AccountDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("SELECT acc FROM AccountDTO acc WHERE acc.name = ?1")
    List<AccountDTO> findAccountByName(String name);




}
