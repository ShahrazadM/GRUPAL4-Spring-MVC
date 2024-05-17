package awakwlab.Grupal4.DAO;
import awakwlab.Grupal4.Modelo.been.Capacitaciones;
import java.util.List;

public interface ICapacitacionDAO {
	
	    List<Capacitaciones> obtenerCapacitaciones();
	    
	    boolean crearCapacitacion(Capacitaciones capacitaciones);
	}