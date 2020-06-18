package fi.solita.validationdemo;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
@RestController
public class ValidatingController {
 
    @GetMapping("/test")
    ResponseEntity<String> test(@Min(1) Integer arg0, @NotNull String arg1) {
        System.out.println("THIS IS FINE");
        System.out.println(arg0);
        System.out.println(arg1);
        return ResponseEntity.ok("Parameters are valid");
    }
}
