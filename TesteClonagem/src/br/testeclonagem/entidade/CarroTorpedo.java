package br.testeclonagem.entidade;

public class CarroTorpedo {
	
	private Long idLocalizacao;
	private String nrCT;
	public Long getIdLocalizacao() {
		return idLocalizacao;
	}
	public void setIdLocalizacao(Long idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}
	public String getNrCT() {
		return nrCT;
	}
	public void setNrCT(String nrCT) {
		this.nrCT = nrCT;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idLocalizacao == null) ? 0 : idLocalizacao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarroTorpedo other = (CarroTorpedo) obj;
		if (idLocalizacao == null) {
			if (other.idLocalizacao != null)
				return false;
		} else if (!idLocalizacao.equals(other.idLocalizacao))
			return false;
		return true;
	}
	
	

}
