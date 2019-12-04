package com.marmitex.service.serviceImpl;

import com.marmitex.data.RelatorioPedidoEmpresaData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.RelatorioPedidoEmpresa;
import com.marmitex.service.RelatorioPedidoEmpresaService;
import org.springframework.data.jpa.repository.JpaRepository;

public class RelatorioPedidoEmpresaServiceImpl extends CrudServiceImpl<RelatorioPedidoEmpresa, Long> implements RelatorioPedidoEmpresaService {

    private final RelatorioPedidoEmpresaData relatorioPedidoEmpresaData;

    public RelatorioPedidoEmpresaServiceImpl(RelatorioPedidoEmpresaData relatorioPedidoEmpresaData) {
        this.relatorioPedidoEmpresaData = relatorioPedidoEmpresaData;
    }

    @Override
    public JpaRepository<RelatorioPedidoEmpresa, Long> getRepository() {
        return relatorioPedidoEmpresaData;
    }
}
