package com.example.java.sms.repository;

import com.example.java.sms.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product, Long> {



}
