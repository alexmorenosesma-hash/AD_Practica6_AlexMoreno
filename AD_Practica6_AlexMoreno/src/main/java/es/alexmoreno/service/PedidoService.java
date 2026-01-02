/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.alexmoreno.service;

import es.alexmoreno.Domain.Pedido;
import es.alexmoreno.Domain.Producto;
import es.alexmoreno.repository.PedidoRepository;
import es.alexmoreno.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;
    
    @Transactional
    public void añadirProductoPedido(Producto producto,Pedido pedido){
        pedido.getProductos().add(producto);
        pedidoRepository.save(pedido);
    }
    
    @Transactional
    public void eliminarProductoPedido(Producto producto,Pedido pedido){
       pedido.getProductos().remove(producto);
       pedidoRepository.save(pedido);
    }
}
