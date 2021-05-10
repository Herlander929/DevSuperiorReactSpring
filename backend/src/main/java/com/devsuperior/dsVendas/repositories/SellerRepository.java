package com.devsuperior.dsVendas.repositories;

import com.devsuperior.dsVendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SellerRepository extends JpaRepository<Seller, Long> {

}
