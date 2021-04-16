package br.com.bandtec.projetolutalivre.controle;

import br.com.bandtec.projetolutalivre.dominio.LutaLivre;
import br.com.bandtec.projetolutalivre.repositorio.LutaLivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")
public class LutaLivreController {

    @Autowired
    private LutaLivreRepository repository;

    @PostMapping
    public ResponseEntity postLutaLivre(@RequestBody @Valid LutaLivre novaLutaLivre) {
        if (novaLutaLivre.getForcaGolpe()<0){
            return ResponseEntity.status(400).body("Força do golpe tem que ser um valor acima de 0.");
        }
        else {
           // repository.save(novaLutaLivre);
            return ResponseEntity.status(201).build();
        }
    }

    @GetMapping
    public ResponseEntity getLutaLivres() {
        return ResponseEntity.status(200).body(repository.findAll());
    }



}
