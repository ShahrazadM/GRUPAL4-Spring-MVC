package awakwlab.Grupal4.DAO;


	import awakwlab.Grupal4.Modelo.been.Capacitaciones;
	import java.util.ArrayList;
	import java.util.List;

	public class CapacitacionesDAOImpl implements ICapacitacionDAO {
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

	    @Override
	    public boolean crearCapacitacion(Capacitaciones capacitaciones) {
	        return capacitaciones.add(capacitaciones);
	    }

		
	}
