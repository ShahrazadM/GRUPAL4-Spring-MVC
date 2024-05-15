package awakwlab.Grupal4.controladores;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import awakwlab.Grupal4.Modelo.been.Contacto;
import awakwlab.Grupal4.Modelo.Service.ContactoService;
@Controller
public class CrearContactoController {

    @Autowired
    private ContactoService cs;

    @RequestMapping(value = "/crearcontacto", method = RequestMethod.GET)
    public String mostrarFormularioCrearContacto() {
        return "/crearcontacto"; // Devuelve el nombre de la vista del formulario
    }
    @RequestMapping(value = "/crearcontacto", method = RequestMethod.POST)
    public String crearContacto(@ModelAttribute("contacto") Contacto contacto, HttpServletResponse response) throws IOException {
        cs.create(contacto); // Llama al método create del servicio para crear el contacto
        return "redirect:/contacto"; // Redirige a la página de lista de contactos después de crear el contacto
    }
   
    
    
    
}