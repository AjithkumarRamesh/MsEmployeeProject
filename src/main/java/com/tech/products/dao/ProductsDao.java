package com.tech.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.products.entity.Products;
import com.tech.products.repositoty.ProductsRepositoty;

@Repository
public class ProductsDao {
	@Autowired
	ProductsRepositoty proRepo;

	public String setProduct(Products p) {
		proRepo.save(p);
		return "Successfully Saved";
	}

	public String setAllProduct(List<Products> p) {
		proRepo.saveAll(p);
		return "Successfully saved All";
	}

	public Products setAllProduct(int id) {
		return proRepo.findById(id).get();
	}

	public List<Products> getAllProduct() {
		return proRepo.findAll();
	}

}
