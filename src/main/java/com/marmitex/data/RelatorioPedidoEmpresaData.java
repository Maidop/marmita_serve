package com.marmitex.data;

import com.marmitex.model.Pedido;
import com.marmitex.model.RelatorioPedidoEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatorioPedidoEmpresaData extends JpaRepository<RelatorioPedidoEmpresa, Long> {
}
