package com.devsuperior.dsVendas.repositories;

import com.devsuperior.dsVendas.dto.SaleSuccessDTO;
import com.devsuperior.dsVendas.dto.SaleSumDTO;
import com.devsuperior.dsVendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SaleRepository extends JpaRepository<Sale, Long> {


    @Query("SELECT new com.devsuperior.dsVendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            "FROM Sale AS obj GROUP BY obj.seller ")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsVendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            "FROM Sale AS obj GROUP BY obj.seller ")
    List<SaleSuccessDTO> successGroupedBySeller();

}
