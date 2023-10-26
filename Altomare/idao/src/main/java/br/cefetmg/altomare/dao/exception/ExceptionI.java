
package br.cefetmg.altomare.dao.exception;


public class ExceptionI extends Exception {

    public ExceptionI(String msg, Exception exception) {
        super(msg, exception);
    }

    public ExceptionI(String msg) {
        super(msg);
    }

}