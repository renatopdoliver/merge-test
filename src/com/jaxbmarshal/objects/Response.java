package com.jaxbmarshal.objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "obterUrlSSOResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {

	@XmlElement
	private StatusIntegracao statusIntegracao;

//	@XmlElement(name = "return")
	@XmlElement
	private Return _return;

	public Response() {
	}

	
	public StatusIntegracao getStatusIntegracao() {
		return statusIntegracao;
	}

	public void setStatusIntegracao(StatusIntegracao statusIntegracao) {
		this.statusIntegracao = statusIntegracao;
	}
	
	
	public Return get_return() {
		return _return;
	}

	public void set_return(Return _return) {
		this._return = _return;
	}

}