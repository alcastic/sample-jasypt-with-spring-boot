package cl.acc.sjwsb.samplejasyptwithspringboot;

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EncryptablePropertySource(value = "classpath:encrypted.properties")
public class SampleJasyptWithSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleJasyptWithSpringBootApplication.class, args);
    }
}
