package it.vid.soap.test.jaxb.adapter.complex;

import java.util.HashMap;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import it.vid.soap.test.complexmap.Employee;

@XmlJavaTypeAdapter(EmployeeMapAdapter.class)
public class EmployeeMap<String,Gadget> extends HashMap<String,Employee>
{ 
	
}
