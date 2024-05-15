package awakwlab.Grupal4.Modelo.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


import awakwlab.Grupal4.Modelo.been.Capacitaciones;

@Service
public class CapacitacionService {
private ArrayList<Capacitaciones> capacitaciones = new ArrayList<>();
public CapacitacionService() {
	capacitaciones.add(new Capacitaciones(1, 23457886, "24 ", "1  pm", "oficina", "2 hs",2));
	capacitaciones.add(new Capacitaciones(2, 22222222, "18 ", "12 am", "local", "1 hs",5));
	capacitaciones.add(new Capacitaciones(3, 33333333, "20 ", "10 am", "central", "1 hs",2));
	capacitaciones.add(new Capacitaciones(4, 44444444, "23 ", "11 am", "local", "2 hs",8));
	capacitaciones.add(new Capacitaciones(5, 55555555, "12 ", "12 am", "central", "1 hs",0));
	
}

public ArrayList <Capacitaciones> getAll(){
	return capacitaciones;
}	
public Capacitaciones getOne(int id) {
	for (Capacitaciones capacitaciones: capacitaciones) {
		if (capacitaciones.getIdentificador() == id) {
			return capacitaciones;
		}
	
	}
	return null;
	
}

public void create(Capacitaciones capacitaciones) {
	this.capacitaciones.add(capacitaciones);
}
public void update(Capacitaciones capacitaciones) {
	Capacitaciones cap = getOne(capacitaciones.getIdentificador());
	cap.setRutCliente(capacitaciones.getRutCliente());
	cap.setHora(capacitaciones.getHora());
}

public void delete(int id) {
	capacitaciones.remove(getOne(id));
}
}



