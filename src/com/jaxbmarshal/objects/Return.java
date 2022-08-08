package com.jaxbmarshal.objects;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Return {
	
	private int codigo;
	private String mensagem;
	private float urlAmigavelCompleta;

	public Return() {
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public float getUrlAmigavelCompleta() {
		return urlAmigavelCompleta;
	}

	public void setUrlAmigavelCompleta(float urlAmigavelCompleta) {
		this.urlAmigavelCompleta = urlAmigavelCompleta;
	}

}