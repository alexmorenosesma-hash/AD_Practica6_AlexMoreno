package es.alexmoreno.repository;

import es.alexmoreno.Domain.Pedido;
import es.alexmoreno.Domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long>{
    
}
