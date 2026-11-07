package uchoteles.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DatosPago {
	private String numTarjeta;
	private String cvc;
	private int mesCaducidad;
	private int anhoCaducidad;
	
	private TipoTarjeta tipo;
	private ProveedorTarjeta proveedor;
}
