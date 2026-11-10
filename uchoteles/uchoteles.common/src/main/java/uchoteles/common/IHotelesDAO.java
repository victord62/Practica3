package uchoteles.common;

import java.util.List;

public interface IHotelesDAO {
	
	public List<Hotel> hoteles();
	
	public Hotel hotel(int idHotel);
	
	public Hotel crearHotel(Hotel h);
	
	public Hotel modificarHotel(Hotel h);
	
	public Hotel eliminarHotel(Hotel h);
	
	public Hotel hotelPorNombre(String nombre);
	
	public List<Hotel> hotelesPorLocalidad(String localidad);
}
