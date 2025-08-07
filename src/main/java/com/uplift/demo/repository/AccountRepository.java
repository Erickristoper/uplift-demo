package com.uplift.demo.repository;

import com.uplift.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByAccountNumber(String accountNumber);
}