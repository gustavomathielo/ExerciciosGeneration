package BlogPessoal.BlogPessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import BlogPessoal.BlogPessoal.Model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	

}
