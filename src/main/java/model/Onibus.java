package model;

public class Onibus {
	
	private int codigo;
	private String nomeMotorista;
	private String placa;
    private String marca;
    private int ano;
    private String descricao;
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeMotorista() {
		return nomeMotorista;
	}
	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Onibus [codigo=" + codigo + ", nomeMotorista=" + nomeMotorista + ", placa=" + placa + ", marca=" + marca
				+ ", ano=" + ano + ", descricao=" + descricao + "]";
	}
    
}