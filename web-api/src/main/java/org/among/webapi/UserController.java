package org.among.webapi;

import org.among.core.core.CoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final CoreService coreService;

    public UserController(CoreService coreService) {
        this.coreService = coreService;
    }

    @GetMapping("/biz")
    public ResponseEntity<String> biz() {
        System.out.println("User 모듈에 접근했습니다.");
        coreService.coreLogic();

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
