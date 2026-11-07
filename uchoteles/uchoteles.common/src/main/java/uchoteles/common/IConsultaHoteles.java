package uchoteles.common;

import java.time.LocalDate;
import java.util.List;

public interface IConsultaHoteles {
	
	public Hotel buscarHotelNombre(String nombre);
	
	public List<Hotel> buscarHotelLocalidad(String localidad);
	
	public List<Habitacion> consultarDisponibilidadHabitaciones(
			LocalDate fechaEntrada, LocalDate fechaSalida, Hotel h);
}
