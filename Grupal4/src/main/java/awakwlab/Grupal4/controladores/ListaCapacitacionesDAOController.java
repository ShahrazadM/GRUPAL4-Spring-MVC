package awakwlab.Grupal4.controladores;
//Este controller esta relacionado con DAO//
import awakwlab.Grupal4.DAO.CapacitacionesDAOImpl;
import awakwlab.Grupal4.Modelo.been.Capacitaciones;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListaCapacitacionesDAOController {

    /**
     * Maneja las solicitudes GET para obtener la lista de capacitaciones
     *
     * @param model objeto {@link Model} para agregar atributos que se enviarán a la vista
     * @return el nombre de la vista que se debe mostrar
     */
    @GetMapping("/listarcapacitacionesdao")
    public String obtenerCapacitaciones(Model model) {
        // Crea una instancia del DAO de capacitaciones
        CapacitacionesDAOImpl dao = new CapacitacionesDAOImpl();

        // Obtiene la lista de capacitaciones del DAO
        List<Capacitaciones> listaCapacitaciones = dao.obtenerCapacitaciones();

        // Agrega la lista de capacitaciones al modelo para que esté disponible en la vista
        model.addAttribute("listarcapacitacionesdao", listaCapacitaciones);

        // Devuelve el nombre de la vista que se debe mostrar
        return "listarcapacitacionesdao";
    }
}