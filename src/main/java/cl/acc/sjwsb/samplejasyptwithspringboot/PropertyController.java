package cl.acc.sjwsb.samplejasyptwithspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    @Value("${encrypted.property}")
    private String property;

    @GetMapping("/properties")
    public ResponseEntity<?> allProperties() {
        return ResponseEntity.ok(property);
    }
}
