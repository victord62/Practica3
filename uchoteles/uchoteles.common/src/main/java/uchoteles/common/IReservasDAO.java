package uchoteles.common;

import java.util.List;

public interface IReservasDAO {
	
	public List<Reserva> reservas();
	
	public Reserva reserva(int idReserva);
	
	public Reserva crearReserva(Reserva r);
	
	public Reserva modificarReserva(Reserva r);
	
	public Reserva eliminarReserva(Reserva r);
	
	public List<Reserva> reservasPorHotel(int idHotel);
}
