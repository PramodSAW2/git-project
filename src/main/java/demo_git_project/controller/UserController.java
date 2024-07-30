package demo_git_project.controller;

import demo_git_project.entity.User;
import demo_git_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("api/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User reg = userService.createReg(user);
       return  new ResponseEntity<>(user, HttpStatus.CREATED);

    }
    public ResponseEntity<User> getById(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
