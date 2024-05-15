package awakwlab.Grupal4.controladores;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import awakwlab.Grupal4.Modelo.been.Capacitaciones;

import awakwlab.Grupal4.Modelo.Service.CapacitacionService;

@Controller
public class CrearCapacitacionController {

	@Autowired
    private CapacitacionService capacitacionservise;

    
	@RequestMapping(value = "/crearcapacitacion", method = RequestMethod.GET)
    public String mostrarFormularioCrearCapacitacion() {
        return "/crearcapacitacion"; // Devuelve el nombre de la vista del formulario
    }
    @RequestMapping(value = "/crearcapacitacion", method = RequestMethod.POST)
    public String crearCapacitacion(@ModelAttribute("capacitacion") Capacitaciones capacitaciones, HttpServletResponse response) throws IOException {
    	capacitacionservise.create(capacitaciones); // Llama al método create del servicio para crear el contacto
        return "redirect:/listacapacitaciones"; // Redirige a la página de lista de contactos después de crear el contacto
    }
}