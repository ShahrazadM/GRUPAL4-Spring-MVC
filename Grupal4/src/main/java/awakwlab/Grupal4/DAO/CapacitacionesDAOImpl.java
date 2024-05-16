package awakwlab.Grupal4.DAO;


	import awakwlab.Grupal4.Modelo.been.Capacitaciones;
	import java.util.ArrayList;
	import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

	@Component
	public class CapacitacionesDAOImpl implements ICapacitacionDAO {
	/*private ArrayList<Capacitaciones> capacitaciones = new ArrayList<>();*/
		 private static final Logger LOGGER = Logger.getLogger(CapacitacionesDAOImpl.class.getName());
		    private ArrayList<Capacitaciones> capacitaciones = new ArrayList<>();

		public CapacitacionesDAOImpl() {
			capacitaciones.add(new Capacitaciones(1, 44444444, "24 ", "13  pm", "oficina", "2 hs",2));
			capacitaciones.add(new Capacitaciones(2, 66666666, "18 ", "09 am", "oficina", "1 hs",5));
			capacitaciones.add(new Capacitaciones(3, 88888888, "20 ", "13 am", "oficina", "1 hs",2));
			capacitaciones.add(new Capacitaciones(4, 10101010, "23 ", "10 am", "oficina", "2 hs",8));
			capacitaciones.add(new Capacitaciones(5, 20202020, "12 ", "12 am", "oficina", "1 hs",0));
			
		}
	    @Override
	    public List<Capacitaciones> obtenerCapacitaciones() {
	        return capacitaciones;
	    }

		/*
		 * @Override public boolean crearCapacitacion(Capacitaciones capacitacion) { //
		 * Agrega la capacitación a la lista capacitaciones.add(capacitacion);
		 */

			/*
			 * // Despliega los datos de la capacitación por consola
			 * System.out.println("Datos de la capacitación creada:");
			 * System.out.println("IDentificador: " + capacitacion.getIdentificador());
			 * System.out.println("RutCliente: " + capacitacion.getRutCliente());
			 * System.out.println("Fecha: " + capacitacion.getDia());
			 * System.out.println("Hora: " + capacitacion.getHora());
			 * System.out.println("Lugar: " + capacitacion.getLugar());
			 * System.out.println("Duración: " + capacitacion.getDuracion());
			 * System.out.println("Cantidad de asistentes: " +
			 * capacitacion.getCantidadAsistentes());
			 
	        return true; // Indica que la capacitación fue creada con éxito
	        */
	        
	        @Override
	        public boolean crearCapacitacion(Capacitaciones capacitacion) {
	            boolean added = capacitaciones.add(capacitacion);
	            if (added) {
	                // Desplegar los datos de la capacitación por consola
	                System.out.println("Nueva capacitación creada:");
	                System.out.println("IDentificador: " + capacitacion.getIdentificador());
	                System.out.println("RutCliente: " + capacitacion.getRutCliente());
	                System.out.println("Fecha: " + capacitacion.getDia());
	                System.out.println("Hora: " + capacitacion.getHora());
	                System.out.println("Lugar: " + capacitacion.getLugar());
	                System.out.println("Duración: " + capacitacion.getDuracion());
	                System.out.println("Cantidad de Asistentes: " + capacitacion.getCantidadAsistentes());
	                LOGGER.info("GRACIAS POR CONFIAR EN NUESTRA EMPRESA ESTAMOS PARA SERVIRLE ♥♥☻");
	                LOGGER.info("RUBEN;NAYARETH;FRASIEL Y SCHEREZADE ESTAMOS A SU DISPOCISION ☻ ...xD");
	            } else {
	                LOGGER.warning("No se pudo agregar la capacitación: " + capacitacion);
	            }
	            return added;
	            
	            
	        }
	    }
	
