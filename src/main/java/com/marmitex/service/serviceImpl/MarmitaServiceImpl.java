package com.marmitex.service.serviceImpl;

import com.marmitex.data.MarmitaData;
import com.marmitex.framework.CrudServiceImpl;
import com.marmitex.model.Marmita;
import com.marmitex.service.MarmitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MarmitaServiceImpl extends CrudServiceImpl<Marmita, Long> implements MarmitaService {

    @Autowired
    private MarmitaData marmitaData;

    @Override
    public JpaRepository<Marmita, Long> getRepository() {
        return marmitaData;
    }
}
