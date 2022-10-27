package git.snippet.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientStartApp {
    public static void main(String[] args) {
        SpringApplication.run(ClientStartApp.class, args);
    }
}
