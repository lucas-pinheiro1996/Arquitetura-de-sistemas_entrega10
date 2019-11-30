package br.usjt.usjt_ccp3anmca_springdata.model.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_ccp3anmca_springdata.model.beans.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	public Cidade findByNome (String nome);
	
	public List <Cidade> queryByNome (String nome);
	
	@Transactional
	public long deleteByNome (String nome);
	
	public int countByNome (String nome);

	public Cidade findByLatitudeAndLongitude (double latitude, double longitude);

	public Cidade findByNomeIgnoreCase(String string);


	
}




