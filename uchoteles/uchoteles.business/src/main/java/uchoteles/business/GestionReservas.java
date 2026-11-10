package uchoteles.business;

import java.time.LocalDate;
import java.util.List;

import uchoteles.common.*;

public class GestionReservas implements IGestionReservasUsuario, IGestionReservasGerente {
	
	private IReservasDAO reservasDAO;
	
	@Override
	public Reserva crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, 
			List<ReservaHabitacion> habitaciones, Hotel hotel) {
		Reserva reserva = new Reserva();
		reserva.setFechaEntrada(fechaEntrada);
		reserva.setFechaSalida(fechaSalida);
		reserva.setReservasHabitacion(habitaciones);
		return reservasDAO.crearReserva(reserva);
	}
	
	@Override
	public Reserva confirmarReserva(Reserva r, Hotel h) {
		if (reservasDAO.reserva(r.getIdReserva()) != null) {
			return reservasDAO.modificarReserva(r);
		} else {
			return null;
		}
	}
	
	@Override
	public Reserva cancelarReserva(int idReserva, String dni) {
		Reserva reserva = reservasDAO.reserva(idReserva);
		
		if ((reserva.getDatosCliente().getDni().equals(dni))) {
			return reservasDAO.eliminarReserva(reserva);
		} else {
			return null;
		}
	}
	
	@Override
	public Reserva consultarReserva(int idReserva, String dni) {
		Reserva reserva = reservasDAO.reserva(idReserva);
		
		if ((reserva.getDatosCliente().getDni().equals(dni))) {
			return reserva;
		} else {
			return null;
		}
	}
	
	@Override
	public List<Reserva> consultarReservas(Hotel h) {
		return reservasDAO.reservasPorHotel(h.getIdHotel());
	}
}
