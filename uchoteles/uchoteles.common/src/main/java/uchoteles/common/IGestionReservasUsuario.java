package uchoteles.common;

import java.time.LocalDate;
import java.util.List;

public interface IGestionReservasUsuario {
	
	public Reserva crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, 
			List<ReservaHabitacion> habitaciones, Hotel hotel);
	
	public Reserva confirmarReserva(Reserva r, Hotel h);
	
	public Reserva cancelarReserva(int idReserva, String dni);
	
	public Reserva consultarReserva(int idReserva, String dni);
}
