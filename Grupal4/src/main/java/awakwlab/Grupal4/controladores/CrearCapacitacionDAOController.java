package awakwlab.Grupal4.controladores;

import awakwlab.Grupal4.DAO.ICapacitacionDAO;
import awakwlab.Grupal4.Modelo.been.Capacitaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
/*import org.springframework.web.bind.annotation.ResponseBody;*/

@Controller
public class CrearCapacitacionDAOController {
    private final ICapacitacionDAO capacitacionDAO;

    @Autowired
    public CrearCapacitacionDAOController(ICapacitacionDAO capacitacionDAO) {
        this.capacitacionDAO = capacitacionDAO;
    }

    @GetMapping("/crearcapacitacionesdao")
    public String mostrarFormularioCrearCapacitacionDAO() {
        return "crearcapacitacionesdao"; // Devuelve el nombre de la vista del formulario
    }

	/*
	 * @PostMapping("/crearcapacitacionesdao")
	 * 
	 * @ResponseBody public boolean crearCapacitacion(@ModelAttribute Capacitaciones
	 * capacitacion) { return capacitacionDAO.crearCapacitacion(capacitacion); }
	 */
    
    @PostMapping("/crearcapacitacionesdao")
    public String crearCapacitacion(@ModelAttribute Capacitaciones capacitacion, Model model) {
        boolean creadoExitosamente = capacitacionDAO.crearCapacitacion(capacitacion);
        if (creadoExitosamente) {
            model.addAttribute("capacitacion", capacitacion); // Agrega la capacitación al modelo para mostrarla en la vista
            return "detallecapacitacion"; // Devuelve el nombre de la vista para mostrar los detalles de la capacitación
        } else {
            return "errorcrearcapacitacion"; // Devuelve el nombre de la vista de error en caso de fallo en la creación
        }
    }
    
} 


