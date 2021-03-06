package com.example.stock.exchange.stockexchangedataservice.repository;

import com.example.stock.exchange.stockexchangedataservice.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    public List<Company> getAllBySector(String sector);
}
