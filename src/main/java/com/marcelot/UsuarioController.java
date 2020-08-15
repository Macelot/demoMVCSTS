package com.marcelot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
	
	@Autowired
    private UsuarioRepo usuarioRepo;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String nome, @RequestParam String email, @RequestParam float salario) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSalario(salario);
        usuarioRepo.save(usuario);
        return "Added new customer to repo!";
    }

    @GetMapping("/list")
    public Iterable<Usuario> getUsuarios() {
        return usuarioRepo.findAll();
    }

    @GetMapping("/find/{id}")
    public Usuario findCustomerById(@PathVariable Integer id) {
        return usuarioRepo.findCustomerById(id);
    }

}
