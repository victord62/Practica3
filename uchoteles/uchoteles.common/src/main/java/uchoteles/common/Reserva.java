package uchoteles.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Reserva {
	private int idReserva;
	private LocalDateTime fechaRealizacion;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;
	private double importe;
	private boolean completada;
	
	private DatosCliente datosCliente;
	private DatosPago datosPago;
	private List<ReservaHabitacion> reservasHabitacion;
}
