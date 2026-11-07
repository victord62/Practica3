package uchoteles.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Habitacion {
	private int idHabitacion;
	private double precioPorNoche;
	private int existentes;
	
	private TipoHabitacion tipo;
}
