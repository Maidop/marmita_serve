package com.marmitex.data;

import com.marmitex.model.Marmita;
import com.marmitex.model.TipoComida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarmitaData extends JpaRepository<Marmita, Long> {
}
