package com.mitocode.service;

import java.util.List;

public interface ICRUD<T> {

	T registrar(T obj);
	T modificar(T obj);
	T listarPorId(Integer id);
	List<T> listar();
	void eliminar(Integer id);
}
