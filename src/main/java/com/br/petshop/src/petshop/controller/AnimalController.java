package com.br.petshop.src.petshop.controller;

import java.util.ArrayList;
import java.util.List;

import com.br.petshop.src.petshop.model.Animal;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * AnimalController
 */

@Controller
public class AnimalController {
    private int id = 0;
    private List<Animal> animais = new ArrayList<>(); // Declarando

    /**
     * HTTP
     * - Post: Enviar/Receber dados
     * - Get: Acessar algo
     * - Put: Atualizar
     * - Delete: Deletar algo
     * 
     * 1 - Criar um novo animal
     * > Dados do animal (Nome, Raça e Espécie)
     * > Formulário
     * > Method: Post
     * 
     */

    /**
     * Form:
     * nome => animal.getNome(nome),
     * raça => animal.getRaca(raça)
     * especie => animal.getEspecie(especie)
     * 
     */

    // http://localhost:8080/animais/cadastrar
    @PostMapping(value = "/animais/cadastrar", consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
    public String cadastrar(Model model, @ModelAttribute("animal") Animal animal) {
        this.id = this.id + 1;

        animal.setId(this.id);

        this.animais.add(animal);

        model.addAttribute("animais", this.animais);

        return "pages/animais/index";
    }

    @GetMapping(value = "/animais/cadastrar")
    public String getForm(Model model) {
        Animal animal = new Animal();

        model.addAttribute(animal);

        return "pages/animais/create";
    }

    // Tratar dados, fazer a lógica do lógica do recurso e enviar para o view
    // as informações que o usuário necessita.

}