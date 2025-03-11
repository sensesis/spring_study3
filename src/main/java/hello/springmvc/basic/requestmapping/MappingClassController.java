package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user() {
        return "get User";
    }

    @PostMapping
    public String addUser() {
        return "post User";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable("userId") String userId) {
        return "get " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable("userId") String userId) {
        return "update " + userId;
    }

    @DeleteMapping("/{userId}")
    public String delete(@PathVariable("userId") String userId) {
        return "delete " + userId;
    }
}
