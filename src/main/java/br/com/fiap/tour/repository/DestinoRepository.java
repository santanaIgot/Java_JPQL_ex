package br.com.fiap.tour.repository;

import br.com.fiap.tour.domain.Destino;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DestinoRepository extends JpaRepository<Destino, Long> {
//        @Query("select c from Cliente c where c.nome.id =: idDestino")
//        Page<Destino> buscarPorDestino(@Param("nome") String nome);
}
