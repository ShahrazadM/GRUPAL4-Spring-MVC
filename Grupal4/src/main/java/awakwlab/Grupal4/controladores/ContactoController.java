package awakwlab.Grupal4.controladores;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import awakwlab.Grupal4.Modelo.been.Contacto;
import awakwlab.Grupal4.Modelo.Service.ContactoService;



@Controller
public class ContactoController {
	
	@Autowired
	
	private ContactoService cs;
	@RequestMapping(value = "/contacto", method = RequestMethod.GET)
public ModelAndView mostrarContacto() {
	ArrayList <Contacto> contactos = cs.getAll();
	
	
	
	return new ModelAndView("contacto","contacto",contactos);
}

}
