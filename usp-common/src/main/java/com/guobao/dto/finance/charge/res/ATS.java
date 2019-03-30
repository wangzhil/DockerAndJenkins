package com.guobao.dto.finance.charge.res;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.guobao.dto.finance.pub.res.PUB;



@XmlRootElement(name = "ATS")
public class ATS {
	
    private PUB pub;

    private OUT out;

    @XmlElement(name="PUB")
	public PUB getPub() {
		return pub;
	}

	public void setPub(PUB pub) {
		this.pub = pub;
	}

	@XmlElement(name="OUT")
	public OUT getOut() {
		return out;
	}

	public void setOut(OUT out) {
		this.out = out;
	}

    
}
