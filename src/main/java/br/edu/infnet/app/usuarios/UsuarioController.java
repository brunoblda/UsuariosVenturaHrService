/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.app.usuarios;

import br.edu.infnet.infra.usuarios.UsuarioRepository;
import br.edu.infnet.domain.usuarios.Usuario;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bruno
 */

@RestController
@RequestMapping({"/usuarios"})
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository repository;
    
    @GetMapping
    public Collection<Usuario> ListarUsuarios(){
        
        return repository.listar();
        
    }
    
    @GetMapping(path = {"/{id}"})
    public Usuario obterUsuarioById(@PathVariable int id){
        return repository.obter(id);
    }
    
    @PostMapping(path = {"/cadastro"})
    public void criarUsuario(@RequestBody Usuario usuario){
       
        /*
        
        ############   Teste    ##############
       
        System.out.println("Teste3");

        System.out.println(usuario.getNome());
        
        System.out.println("Teste");
        
         */
        
        Usuario usuarioRetorno; 
        
        usuarioRetorno = repository.adicionar(usuario);
        
        
    }
    
}
