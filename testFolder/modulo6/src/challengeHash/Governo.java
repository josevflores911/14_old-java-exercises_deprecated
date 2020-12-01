package challengeHash;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import collection.Aluno;

import java.util.HashMap;
import java.math.BigDecimal;

public class Governo {

	// armazena uma lista de pol�ticos por estado da federa��o
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}

	
	
	
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		
		// recupera a lista de pol�ticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		
		
		
		
		// se n�o existir uma lista de pol�ticos para o partido informado,
		// devemos instanciar uma nova lista (pois � a primeira inclus�o neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}
		
		
		
		
		// adiciona o pol�tico recebido como par�metro � lista de pol�ticos
		politicos.add(politico);
		
		
		
		
		// adiciona a lista de pol�ticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}

	
	
	
	
	
	
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de pol�ticos para o partido informado
		// e c�lculo dos sal�rios
		
		BigDecimal aqui = BigDecimal.ZERO;
		
		List<Politico> 
		
		for(List<Politico> algo : partidosPoliticos.values()) {
			aqui =  ((Politico) algo).getCargo().getSalario();
			System.out.println("salarios: " +  algo.getPolitico().getCargo().getSalario());
		}
		return aqui;
		
	}
	
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos pol�ticos para o partido e cargo informados
		// e c�lculo dos sal�rios
	}

}