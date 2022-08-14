package dev.cesar;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped	
public class FrutasService {
	
	public List<Fruta> list() {
        return Fruta.listAll();
    }
    
    @Transactional
    public void novaFruta(InserirFrutaDTO inserirFrutaDTO) {
        Fruta fruta = new Fruta();
        fruta.nome = inserirFrutaDTO.getNome();
        fruta.qtd = inserirFrutaDTO.getQtd();
        fruta.persist();
    }

}
