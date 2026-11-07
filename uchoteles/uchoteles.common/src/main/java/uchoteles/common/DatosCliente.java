package uchoteles.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DatosCliente {
	private String dni;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String email;
}
