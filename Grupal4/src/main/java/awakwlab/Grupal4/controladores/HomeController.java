package awakwlab.Grupal4.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     * 
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView mostrarHome() {
        ModelAndView modelAndView = new ModelAndView("inicio"); // Cambiado a "inicio"
        modelAndView.addObject("mensaje", "Bienvenido al Portal xD");
        return modelAndView;
    }
}