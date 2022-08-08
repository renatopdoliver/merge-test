package com.jaxbmarshal.controllers;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.jaxbmarshal.objects.Response;

public class XmlToObject {
	public static void main(String[] args) {
		try {
			
			File file = new File("response.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Response resp = (Response) jaxbUnmarshaller.unmarshal(file);
			System.out.println(resp);
			
			System.out.println("Este é um novo código adicionado!");
			
			System.out.println("Este é um código da fetaure 2 de novo");

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}