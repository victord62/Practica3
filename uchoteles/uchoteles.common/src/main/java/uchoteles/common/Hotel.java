package uchoteles.common;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Hotel {
	private int idHotel;
	private String nombre;
	private String direccion;
	private String localidad;
	
	private Categoria categoria;
	private List<Reserva> reservas;
	private List<Habitacion> habitaciones;
}
