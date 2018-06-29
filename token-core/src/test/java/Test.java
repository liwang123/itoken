import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Test {

    public static void main(final String[] args) {
        HashMap<String, Object> map = Maps.newHashMap();
        HashMap<String, String> entityMap = Maps.newHashMap();
        entityMap.put("assetName","sds");
        entityMap.put("issuserName","sds");
        entityMap.put("symbol","dsd");
        map.put("code",200);
        map.put("entity",entityMap);
        JSONObject json = new JSONObject(map);


        System.out.println(json);
    }

    static class User{
        String name;
        String password;

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(final String password) {
            this.password = password;
        }
    }
}
