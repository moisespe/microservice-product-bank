package com.nttdata.bank.product.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bank.product.model.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{

}
