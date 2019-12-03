package com.marmitex.data;

import com.marmitex.model.Marmita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarmitaData extends JpaRepository<Marmita, Long> {
}
