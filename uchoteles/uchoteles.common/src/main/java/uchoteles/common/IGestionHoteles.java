package uchoteles.common;

import java.util.List;

public interface IGestionHoteles {
	
	public List<Habitacion> consultarTiposHabitaciones(Hotel h);
	
	public Habitacion agregarTipoHabitacion(Hotel h, Habitacion r);
	
	public Habitacion modificarTipoHabitacion(Hotel h, Habitacion r);
	
	public Habitacion eliminarTipoHabitacion(Hotel h, Habitacion r);
}
