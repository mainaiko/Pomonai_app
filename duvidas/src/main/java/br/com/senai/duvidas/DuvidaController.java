package br.com.senai.duvidas;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
@RequestMapping("/duvida")
@CrossOrigin(origins ="http://localhost:8081") //CORS
public class DuvidaController {
    @GetMapping     
    public String mostrarDuvida(){
        return "O qué é Maven?";
    }
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroDuvida dados){
        IO.println(dados); 
    }
}
/*


@RestController 
@RequestMapping("/hello") 
public class AloController{    
   
    @GetMapping
    public String aloMundo() {
        return "Olá Mundo";
    }
   

}



*/
