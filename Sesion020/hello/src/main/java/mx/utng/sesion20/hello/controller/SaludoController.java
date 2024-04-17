package mx.utng.sesion20.hello.controller;

import org.springframework.web.bind.annotation.RestController;

import mx.utng.sesion20.hello.model.Saludo;

@RestController

public class SaludoController {
    public Saludo saludar(){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hello word");
        return saludo;
    }


    
}
