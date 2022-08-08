package com.jaxbmarshal.controllers;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.jaxbmarshal.objects.Employee;

public class ObjectToXml {
	public static void main(String[] args) throws Exception {
		JAXBContext contextObj = JAXBContext.newInstance(Employee.class);

		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Employee emp1 = new Employee(1, "Vimal Jaiswal", 50000);

		marshallerObj.marshal(emp1, new FileOutputStream("employee.xml"));
		
		System.out.println("Este é um código da fetaure 2");

	}
}