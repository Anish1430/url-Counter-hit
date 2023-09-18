package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")

public class UrlHitController {

    @Autowired
       private UrlHitService urlHitService;
        @GetMapping("count")
      public int getHitscount() {
       return urlHitService.getVisitor();
    }
    @GetMapping("username/{username}/count")
      public UserHitCount getHitsCount(@PathVariable String username){
            int hitCount=urlHitService.getUserVisitorCount(username);
            return new UserHitCount(username,hitCount);
    }
}
