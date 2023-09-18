package Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Component
public class UrlHitService {
      private int visitorCount=0;
      private Map<String,Integer> userVisitorCountMap=new HashMap<>();
       public int getVisitor(){
          return  ++visitorCount;
       }
    public int getUserVisitorCount(String username) {
        Integer currentCount = userVisitorCountMap.getOrDefault(username, 0);
        int newCount = currentCount + 1;
        userVisitorCountMap.put(username, newCount);
        return newCount;
    }
}
