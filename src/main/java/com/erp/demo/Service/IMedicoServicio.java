package com.erp.demo.Service;

import java.util.List;

import com.erp.demo.Modelo.MedicoModelo;

public interface IMedicoServicio {

	public void RegistrarMedico(MedicoModelo clmedico);
	public List<MedicoModelo> ListadoProductos();
	
}
