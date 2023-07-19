package com.tech.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.products.dao.ProductsDao;
import com.tech.products.entity.Products;

@Service
public class ProductsService {
	@Autowired
	ProductsDao prodao;

	public String setProduct(Products p) {
		return prodao.setProduct(p);

	}

	public String setAllProduct(List<Products> p) {
		return prodao.setAllProduct(p);
	}

	public Products setAllProduct(int id) {
		return prodao.setAllProduct(id);
	}

	public List<Products> getAllProduct() {
		return prodao.getAllProduct();
	}

}
