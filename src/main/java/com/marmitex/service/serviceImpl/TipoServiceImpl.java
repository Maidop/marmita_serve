package com.marmitex.service.serviceImpl;

import com.marmitex.data.TipoData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Tipo;
import com.marmitex.service.TipoService;
import org.springframework.data.jpa.repository.JpaRepository;

public class TipoServiceImpl extends CrudServiceImpl<Tipo, Long> implements TipoService {

    private TipoData tipoData;

    @Override
    public JpaRepository<Tipo, Long> getRepository() {
        return tipoData;
    }
}
