package chen.firstSpring.controller;

import chen.firstSpring.po.User;
import chen.firstSpring.request.RequestGetUser;
import chen.firstSpring.response.Response;
import chen.firstSpring.service.UserService;
import com.alibaba.druid.wall.violation.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.BindException;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private  UserService userService ;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findUserId(@PathVariable("id") int id) {
        User  user = userService.findUserId(id);
        return user;
    }

    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public Response GetUser(@Valid @RequestBody RequestGetUser requestGetUser){
        Response<User>  response = new Response();
//        if(bindingResult.hasErrors()){
//            String mess = bindingResult.getFieldError().getDefaultMessage();
//            System.out.println(mess);
//
//            response.setMessage("请求参数问题"+mess);
//
//            return response;
//        }
        System.out.println(requestGetUser.getId());
        User  user = userService.findUserId(requestGetUser.getId());
        response.setConnt(user);
        return response;






    }



    @RequestMapping(value = "/hello",method = RequestMethod.GET )
    public   String   helloword(){
        return "home";
    }

}
