package es.alexmoreno.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name ="Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column (name ="cliente",length = 100)
    private String cliente;
    @Column (name = "estado",length = 100)
    private String estado;
    @Column (name = "total")
    private double total;
    @Column (name = "productos")
    private List<Producto> productos;

    public Pedido() {
    }

    public Pedido(LocalDate fecha, String cliente, String estado, double total, List<Producto> productos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.estado = estado;
        this.total = total;
        this.productos = productos;
    }

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
