package chen.firstSpring.controller;


import chen.firstSpring.response.Response;


import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;


import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@ControllerAdvice
public class myExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<?>  testException(MethodArgumentNotValidException ex){
        Response<?>  response  = new Response();
        response.setStatus(200);
        BindingResult  bindingResult = ex.getBindingResult();
        response.setMessage(bindingResult.getFieldError().getDefaultMessage());
      return response;
    }
    @ExceptionHandler(value = Throwable.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handleException(Throwable ex) {
        Response<?> response = new Response<>();
        response.setMessage("服务器内部错误");
        return response;
    }
    @ExceptionHandler(value = {HttpMessageNotReadableException.class, JsonMappingException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Response<?> handleException(Exception ex) {
        Response<?> response = new Response<>();
        response.setMessage("json格式错误");
        return response;
    }



}
