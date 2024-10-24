package com.erp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.demo.Modelo.MedicoModelo;
import com.erp.demo.Repository.IMedicoRepository;

@Service
public class MedicoServicio implements IMedicoServicio {

	@Autowired
	private IMedicoRepository imedicorepository;
	
	@Override
	public void RegistrarMedico(MedicoModelo clmedico) {
		// TODO Auto-generated method stub
		imedicorepository.save(clmedico);
	}


	@Override
	public List<MedicoModelo> ListadoProductos() {
		
		return (List<MedicoModelo>) imedicorepository.findAll();
	}

	
}
