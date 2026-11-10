package uchoteles.business;

import java.time.LocalDate;
import java.util.List;

import uchoteles.common.*;

public class GestionHoteles implements IConsultaHoteles, IGestionHoteles {
	
	private IHotelesDAO hotelesDAO;

	@Override
	public List<Habitacion> consultarTiposHabitaciones(Hotel h) {
		Hotel hotelActual = hotelesDAO.hotel(h.getIdHotel());
		return hotelActual.getHabitaciones();
	}

	@Override
	public Habitacion agregarTipoHabitacion(Hotel h, Habitacion r) {
		Hotel hotelActual = hotelesDAO.hotel(h.getIdHotel());
		List<Habitacion> habitaciones = hotelActual.getHabitaciones();
		habitaciones.add(r);
		hotelActual.setHabitaciones(habitaciones);
		hotelesDAO.modificarHotel(hotelActual);
		return r;
	}

	@Override
	public Habitacion modificarTipoHabitacion(Hotel h, Habitacion r) {
		Hotel hotelActual = hotelesDAO.hotel(h.getIdHotel());
		List<Habitacion> habitaciones = hotelActual.getHabitaciones();
		
		boolean encontrado = false;
		int posicion = 0;
		
		while ((posicion < habitaciones.size()) && encontrado == false) {
			if (habitaciones.get(posicion).getIdHabitacion() == r.getIdHabitacion()) {
				habitaciones.remove(posicion);
				habitaciones.add(r);
				encontrado = true;
			}
			posicion++;
		}
		
		hotelActual.setHabitaciones(habitaciones);
		hotelesDAO.modificarHotel(hotelActual);
		return r;
	}

	@Override
	public Habitacion eliminarTipoHabitacion(Hotel h, Habitacion r) {
		Hotel hotelActual = hotelesDAO.hotel(h.getIdHotel());
		List<Habitacion> habitaciones = hotelActual.getHabitaciones();
		habitaciones.remove(r);
		hotelActual.setHabitaciones(habitaciones);
		hotelesDAO.modificarHotel(hotelActual);
		return r;
	}

	@Override
	public Hotel buscarHotelNombre(String nombre) {
		return hotelesDAO.hotelPorNombre(nombre);
	}

	@Override
	public List<Hotel> buscarHotelLocalidad(String localidad) {
		return hotelesDAO.hotelesPorLocalidad(localidad);
	}

	@Override
	public List<Habitacion> consultarDisponibilidadHabitaciones(LocalDate fechaEntrada, LocalDate fechaSalida,
			Hotel h) {
		// TODO ??
		return null;
	}
}
