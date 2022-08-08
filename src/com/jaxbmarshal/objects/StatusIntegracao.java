package com.jaxbmarshal.objects;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusIntegracao {

	private boolean status;
	private String mensagem;
	private int sessionId;

	public StatusIntegracao() {
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

}