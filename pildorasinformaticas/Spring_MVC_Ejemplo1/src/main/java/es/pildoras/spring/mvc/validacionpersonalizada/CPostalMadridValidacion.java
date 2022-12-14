package es.pildoras.spring.mvc.validacionpersonalizada;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// clase que contiene la logica de la validacion
public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{

	@Override
	public void initialize(CPostalMadrid elCodigo) {
		prefijoCodigoMadrid = elCodigo.value(); // almacenamos "28"
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean valCodigo;
		
		if (arg0 != null) valCodigo = arg0.startsWith(prefijoCodigoMadrid);
		else valCodigo = true;
		
		return valCodigo;
	}
	
	private String prefijoCodigoMadrid;
}
