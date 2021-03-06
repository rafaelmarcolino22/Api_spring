package com.curso.rafael.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.rafael.domain.Pedido;
import com.curso.rafael.repositories.PedidoRepository;
import com.curso.rafael.service.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	public PedidoRepository respo;

	public Pedido find(Integer id) {

		Optional<Pedido> obj = respo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(

				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));

	}
}
