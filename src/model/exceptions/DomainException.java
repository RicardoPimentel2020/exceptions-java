package model.exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;// obrigat�rio class exception 

	public DomainException(String msg) {
		super(msg);
	}
}
