package it;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
public class IntegrationTest {

    public IntegrationTest(){

    }

    @Test
    public void contextLoads() {
        ResponseEntity<String> res = new RestTemplate().getForEntity("http://localhost:1879/service", String.class);
        System.out.println(res.getBody().toString());
        Assert.assertEquals("Invalid response returned", "service2", res.getBody().toString());
    }

}
