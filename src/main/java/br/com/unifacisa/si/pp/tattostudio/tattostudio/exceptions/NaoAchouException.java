package br.com.unifacisa.si.pp.tattostudio.tattostudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NaoAchouException extends RuntimeException {
	
	
	private static final long serialVersionUID = -6380569512398671792L;

	public NaoAchouException(String msg) {
		super(msg);
	}

	public static NaoAchouException build(String msg) {
		return new NaoAchouException(msg);
	}

}
