package com.marmitex.service.serviceImpl;

import com.marmitex.data.RelatorioPedidoClienteData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.RelatorioPedidoCliente;
import com.marmitex.service.RelatorioPedidoClienteService;
import org.springframework.data.jpa.repository.JpaRepository;

public class RelatorioPedidoClienteServiceImpl extends CrudServiceImpl<RelatorioPedidoCliente, Long> implements RelatorioPedidoClienteService {

    private final RelatorioPedidoClienteData relatorioPedidoClienteData;

    public RelatorioPedidoClienteServiceImpl(RelatorioPedidoClienteData relatorioPedidoClienteData) {
        this.relatorioPedidoClienteData = relatorioPedidoClienteData;
    }

    @Override
    public JpaRepository<RelatorioPedidoCliente, Long> getRepository() {
        return relatorioPedidoClienteData;
    }
}
