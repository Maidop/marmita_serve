package com.marmitex.data;

import com.marmitex.model.Pessoa;
import com.marmitex.model.TipoComida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaData extends JpaRepository<Pessoa, Long> {
}
