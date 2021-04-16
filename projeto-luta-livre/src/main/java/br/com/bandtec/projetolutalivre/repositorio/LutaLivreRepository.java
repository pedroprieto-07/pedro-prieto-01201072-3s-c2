package br.com.bandtec.projetolutalivre.repositorio;

import br.com.bandtec.projetolutalivre.dominio.LutaLivre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutaLivreRepository extends JpaRepository<LutaLivreRepository, Integer> {

}
