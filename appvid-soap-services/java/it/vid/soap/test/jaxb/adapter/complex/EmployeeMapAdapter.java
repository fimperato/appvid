package it.vid.soap.test.jaxb.adapter.complex;

import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import it.vid.soap.test.complexmap.Employee;
import it.vid.soap.test.complexmap.EmployeeMapModeller;

public class EmployeeMapAdapter extends XmlAdapter<EmployeeMapModeller, EmployeeMap<String,Employee>>
{ 
  @Override
  public EmployeeMap<String,Employee> unmarshal(EmployeeMapModeller modeller)
  {
	EmployeeMap<String,Employee> map = new EmployeeMap<String,Employee>();
    for (EmployeeMapModeller.Entry e : modeller.getEntry())
    {
      map.put(e.getKey(), e.getValue());
    }
    return map;
  }

  @Override
  public EmployeeMapModeller marshal(EmployeeMap<String,Employee> map)
  {
	EmployeeMapModeller modeller = new EmployeeMapModeller();
    for (Map.Entry<String,Employee> entry : map.entrySet())
    {
      EmployeeMapModeller.Entry e = new EmployeeMapModeller.Entry();
      e.setKey(entry.getKey());
      e.setValue(entry.getValue());
      modeller.getEntry().add(e);
    }
    return modeller;
  }
}
