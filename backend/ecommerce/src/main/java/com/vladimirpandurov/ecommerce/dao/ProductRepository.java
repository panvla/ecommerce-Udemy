package com.vladimirpandurov.ecommerce.dao;

import com.vladimirpandurov.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
