package main;

public class ParserFailureException extends RuntimeException {
	public ParserFailureException(String msg) {
		super(msg);
	}
}
