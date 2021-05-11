package com.devsuperior.dsVendas.controlers;

import com.devsuperior.dsVendas.dto.SaleDTO;
import com.devsuperior.dsVendas.dto.SellerDTO;
import com.devsuperior.dsVendas.service.SaleService;
import com.devsuperior.dsVendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleControler {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);



    }
}
