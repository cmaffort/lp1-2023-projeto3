
package br.cefetmg.altomare.model.exception;
import java.util.ArrayList;
import java.util.List;

public class NException extends Exception {

    private List<String> msgs;
    
    public NException() {
        this.msgs = new ArrayList();
    }
    
    public NException(String msg, Exception exception) {
        super(msg, exception);
    }

    public NException(String msg) {
        super(msg);
    }
    
    public NException(List<String> msgs) {
        this.msgs = msgs;
    }
    
    public List<String> getMessages() {
        return this.msgs;
    }
}