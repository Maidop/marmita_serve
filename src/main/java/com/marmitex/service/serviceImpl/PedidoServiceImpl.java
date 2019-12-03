package com.marmitex.service.serviceImpl;

import com.marmitex.data.PedidoData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Marmita;
import com.marmitex.model.Pedido;
import com.marmitex.service.MarmitaService;
import com.marmitex.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends CrudServiceImpl<Pedido, Long> implements PedidoService {

    @Autowired
    private PedidoData pedidoData;

    @Override
    public JpaRepository<Pedido, Long> getRepository() {
        return pedidoData;
    }
}
