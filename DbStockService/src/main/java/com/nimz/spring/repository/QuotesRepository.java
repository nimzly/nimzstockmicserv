package com.nimz.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimz.spring.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
public List<Quote> findByUserName(String username);
}
