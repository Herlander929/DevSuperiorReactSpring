package com.devsuperior.dsVendas.repositories;

import com.devsuperior.dsVendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SaleRepository extends JpaRepository<Sale, Long> {

}
