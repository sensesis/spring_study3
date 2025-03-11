package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/hello-basic")
    public String helloBasic() {
        log.info("HelloBasic");
        return "ok";
    }

    @PostMapping(value = "hello-basic-v2")
    public String helloBasic_v2() {
        log.info("HelloBasic_V2!");
        return "ok2";
    }

    /*
    * PathVariable 사용
    * 변수명이 같으면 생략 가능
    *
    * @PathVariable("userId") String userId -> @pathVariable userId
    * /Maooing/userA
    * */
    @GetMapping("/mapping/{userId}")  // 유지
    public String mappingPath(@PathVariable String userId) {
        log.info("mappingPath userId={}", userId);
        return "ok";
    }

    @GetMapping("/mapping/details/{userId}")  // URL 변경
    public String mappingPath2(@PathVariable String userId) {
        log.info("mappingPath userId={}", userId);
        return "ok";
    }

    @GetMapping("/mapping/users/{userId}/orders/{ordersId}")
    public String mappingPath(@PathVariable("userId") String userId, @PathVariable("ordersId") String ordersId) {
        log.info("mappingPath userId={}, orderId={}", userId, ordersId);
        return "ok";
    }

    @PostMapping(value = "/mapping-consume", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String mappingConsumes() {
        log.info("mappingConumes");
        return "ok";
    }
}
