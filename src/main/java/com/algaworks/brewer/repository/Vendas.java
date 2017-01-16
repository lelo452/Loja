package com.algaworks.brewer.repository;

import com.algaworks.brewer.model.Venda;
import com.algaworks.brewer.repository.helper.venda.VendasQueries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Vendas extends JpaRepository<Venda, Long>, VendasQueries {

}
