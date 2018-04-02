package running;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssociatoController {
	
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

//    @RequestMapping("/greeting")
//    public Associato greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
//    }
    
    @RequestMapping("/listaAssociati")
    public List<Associato> listaAssociati() {
    	
    	System.out.println("test");
    	
    	return null;
    }

}
