package com.erp.demo.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.erp.demo.Modelo.MedicoModelo;
import com.erp.demo.Service.IMedicoServicio;

@Controller
@RequestMapping("/Vistas")
public class MedicoControlador {
	
	@Autowired
	private IMedicoServicio imedicoservicio;
	
	//	Listado
	
	@GetMapping("ListadoMedicos")
	public String ListadoMedico(Model modelo) {
		
		List<MedicoModelo> listado = imedicoservicio.ListadoProductos();
		modelo.addAttribute("listado", listado);
		
		return "/Vistas/ListadoMedicos";
	
	//	Fin de Listado	
		
	}
	
	//	Registro Medico	
	@GetMapping("/RegistrarMedico")
	public String RegistrarMedico(Model model) {
		
		MedicoModelo clmedicoo = new MedicoModelo();
		model.addAttribute("regmedico", clmedicoo);
		
		return "/Vistas/RegistroMedico";
	}
	//	Fin del Registro
	
	
	   @PostMapping("/GuardarMedico")
	   public String GuardarMedico(@ModelAttribute MedicoModelo clmedico,
			   Model modelo) {	   
		   imedicoservicio.RegistrarMedico(clmedico);
		   //emitimos mensaje por consola
		   System.out.println("datos registrado en bd");
		   //retornamos al listado
		   return "redirect:/Vistas/ListadoMedicos";
		   
	   }   //fin del metodo guardar producto...
	   
	
}
