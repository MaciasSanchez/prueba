/**
 * 
 */
package com.pruebafuncional.modeloscanonicos;

/**
 * @author Personal
 *
 */
public enum TipoUsuarioEnum {
	
	INTERNO("INTERNO"),
	EXTERNO("EXTERNO");
	
	private String value;
	
	TipoUsuarioEnum(String value){
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
	public static TipoUsuarioEnum fromValue(String value) {
		for(TipoUsuarioEnum tipo : TipoUsuarioEnum.values()) {
			if(tipo.value.equals(value)) {
				return tipo;
			}
		}
		throw new IllegalArgumentException("Unexpected value '"+value+"'");
	}
	

}
