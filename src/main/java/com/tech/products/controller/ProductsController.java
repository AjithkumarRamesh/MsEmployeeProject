package com.tech.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.products.entity.Products;
import com.tech.products.service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	ProductsService proser;

	@PostMapping(value = "/setProduct")
	public String setProduct(@RequestBody Products p) {
		return proser.setProduct(p);
	}

	@PostMapping(value = "/setAllProduct")
	public String setAllProduct(@RequestBody List<Products> p) {
		return proser.setAllProduct(p);
	}

	@GetMapping(value = "/getProductId/{id}")
	public Products setAllProduct(@PathVariable int id) {
		return proser.setAllProduct(id);
	}

	@GetMapping(value = "/getAllProduct")
	public List<Products> getAllProduct() {
		return proser.getAllProduct();
	}

}
