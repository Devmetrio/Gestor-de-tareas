package main.aplicacion.data;

import main.aplicacion.Domain.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepositorio extends JpaRepository<TareaEntity, Long> {
}
