package br.com.fiap.tour.repository;

import br.com.fiap.tour.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
