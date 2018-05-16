import com.alibaba.fastjson.JSON;

import java.util.Map;

public class Test {

    public static void main(String[] args) {
        User user = new User();
        user.setName("san");
        user.setPassword("1234");
        Map map = JSON.parseObject(JSON.toJSONString(user));
        Integer s = JSON.parseObject(JSON.toJSONString(user)).getInteger("hahaha");
        System.out.println(s.intValue());
        System.out.println(map.get("name"));
    }
    static class User{
        String name;
        String password;

        public void setName(String name) {
            this.name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }
    }
}
