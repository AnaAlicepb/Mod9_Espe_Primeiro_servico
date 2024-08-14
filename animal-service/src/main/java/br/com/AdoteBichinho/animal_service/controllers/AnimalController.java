package br.com.AdoteBichinho.animal_service.controllers;

import br.com.AdoteBichinho.animal_service.dto.ResgatadorDTO;
import br.com.AdoteBichinho.animal_service.entidades.Animal;
import br.com.AdoteBichinho.animal_service.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll(){

        return repository.findAll();

    }

    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
        return repository.findyNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdoptes(){
        return repository.findyAdopted();
    }


    @GetMapping("/animais-resgatadores")
    private List<ResgatadorDTO> findAnimaisPorResgatador(){
        return repository.obterResgatadorQuantidadeAnimais();
    }
}
