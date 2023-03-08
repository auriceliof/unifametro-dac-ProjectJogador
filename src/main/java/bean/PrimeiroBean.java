package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import bd.BancoDeDados;
import entidade.Jogador;

@ManagedBean
public class PrimeiroBean {
	private Jogador jogador = new Jogador();
	private List<Jogador> jogadores;
	
	public String salvar() {
		BancoDeDados.salvar(jogador);
		jogadores = BancoDeDados.select();
		return null;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}
