package awakwlab.Grupal4.Modelo.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import awakwlab.Grupal4.Modelo.been.Contacto;

@Service
public class ContactoService {
private ArrayList<Contacto> contactos = new ArrayList<>();
public ContactoService() {
	contactos.add(new Contacto(1,"ruben", "ruben@", "Universidad", "estudiando"));
	contactos.add(new Contacto(2,"frasiel", "frasiel@", "Universidad"," estudiando"));
	contactos.add(new Contacto(3,"Nayareth", "Nayareth@", "Empresa"," Administrando su nueva Sucursal"));
	contactos.add(new Contacto(2,"Scherezade", "Shaharaz@", "Playa"," Relax meditando xD"));
	
}
public ArrayList <Contacto> getAll(){
	return contactos;
}	
public Contacto getOne(int id) {
	for (Contacto contacto: contactos) {
		if (contacto.getId() == id) {
			return contacto;
		}
	
	}
	return null;
	
}

public void create(Contacto contacto) {
	this.contactos.add(contacto);
}
public void update(Contacto contacto) {
	Contacto cont = getOne(contacto.getId());
	cont.setNombre(contacto.getNombre());
	cont.setEmail(contacto.getEmail());
}

public void delete(int id) {
	contactos.remove(getOne(id));
}
}



