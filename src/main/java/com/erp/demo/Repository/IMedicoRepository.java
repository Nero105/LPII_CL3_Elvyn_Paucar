package com.erp.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.erp.demo.Modelo.MedicoModelo;

public interface IMedicoRepository extends CrudRepository<MedicoModelo, Integer>{

}
