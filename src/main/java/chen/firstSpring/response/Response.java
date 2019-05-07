package chen.firstSpring.response;

import org.springframework.validation.ObjectError;

import java.util.List;

public class Response<T> {

    protected Integer status;
    protected String message;
    protected T connt;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getConnt() {
        return connt;
    }

    public void setConnt(T connt) {
        this.connt = connt;
    }
}
