package awakwlab.Grupal4.controladores;
// Este controller estara relacionado con Servcio//
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import awakwlab.Grupal4.Modelo.been.Capacitaciones;

import awakwlab.Grupal4.Modelo.Service.CapacitacionService;



	
	@Controller
	public class ListaCapacitacionesController {
		
		@Autowired
		
		private CapacitacionService cser;
		@RequestMapping(value = "/listacapacitaciones", method = RequestMethod.GET)
	public ModelAndView mostrarCapacitacion() {
		ArrayList <Capacitaciones> capacitaciones = cser.getAll();
		
		
		
		return new ModelAndView("listacapacitaciones","capacitaciones", capacitaciones);
	}

	}

