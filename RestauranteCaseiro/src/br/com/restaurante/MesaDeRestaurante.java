package br.com.restaurante;

public class MesaDeRestaurante {
	
	private double kgRefeicao;
	private int sobremesa;
	private int refri2L;
	private int refri600ML;
	private int refrilata;
	private int cerveja;
	
	
	public double getKgRefeicao() {
		return kgRefeicao;
	}
	public void setKgRefeicao(double kgRefeicao) {
		this.kgRefeicao = kgRefeicao;
	}
	public int getSobremesa() {
		return sobremesa;
	}
	public void setSobremesa(int sobremesa) {
		this.sobremesa = sobremesa;
	}
	public int getRefri2L() {
		return refri2L;
	}
	public void setRefri2L(int refri2l) {
		refri2L = refri2l;
	}
	public int getRefri600ML() {
		return refri600ML;
	}
	public void setRefri600ML(int refri600ml) {
		refri600ML = refri600ml;
	}
	public int getRefrilata() {
		return refrilata;
	}
	public void setRefrilata(int refrilata) {
		this.refrilata = refrilata;
	}
	public int getCerveja() {
		return cerveja;
	}
	public void setCerveja(int cerveja) {
		this.cerveja = cerveja;
	}
	
	public void adicionaPedido(double KgRefeicao, int sobremesa, int refri2l, int Refri600ML, int refrilata, int cerveja) {
		
		this.kgRefeicao = KgRefeicao;
		this.sobremesa = sobremesa;
		this.refri2L = refri2L;
		this.refri600ML = refri600ML;
		this.refrilata = refrilata;
		this.cerveja = cerveja;
				
	}
	
	public double calculaConta() {
		
		doube valorTotal = this.kgRefeicao*59,90 +
	}
	
}
