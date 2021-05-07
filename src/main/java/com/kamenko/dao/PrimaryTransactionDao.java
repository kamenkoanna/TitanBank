package com.kamenko.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kamenko.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
