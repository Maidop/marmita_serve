package com.marmitex.service.serviceImpl;

import com.marmitex.data.ClienteData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Cliente;
import com.marmitex.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends CrudServiceImpl<Cliente, Integer> implements ClienteService {

    @Autowired
    private ClienteData clienteData;

    @Override
    public JpaRepository<Cliente, Integer> getRepository() {
        return clienteData;
    }
}
