package br.com.exemplo.pacientes_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecursoNaoEcontradoException extends RuntimeException {
    public RecursoNaoEcontradoException(String message) {
        super(message);
    }
}
