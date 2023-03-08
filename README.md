# APIHUB SDK Starter

## How to use it

We first need to import APIHUB depencency
```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>APIHUB-client-sdk</artifactId>
    <version>0.0.1</version>
</dependency>
```

And then we need to set `accessKey` and `secretKey` in `application.yml`
```yml
apihub:
  client:
    access-key: apihub
    secret-key: abcdefgh
```

And then we can use APIHUB SDK by following
```java
import com.example.apihubclientsdk.client.APIHUBClient;
import com.example.apihubclientsdk.model.User;

private APIHUBClient apihubClient;

String result = apihubClient.getNameByGet("zanyuan123");
User user = new User();
user.setUsername("yangzanyuan");
String usernameByPost = apihubClient.getUsernameByPost(user);
System.out.println(result);
System.out.println(usernameByPost);
```