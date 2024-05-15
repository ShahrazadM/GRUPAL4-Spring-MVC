package awakwlab.Grupal4.controladores;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NosotrosController {

    @GetMapping("/nosotros")
    public String mostrarEmpresa() {
        return "nosotros";
    }
}