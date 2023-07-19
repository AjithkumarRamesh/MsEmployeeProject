package com.tech.products.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.products.entity.Products;

public interface ProductsRepositoty extends JpaRepository<Products, Integer>{

	

}
