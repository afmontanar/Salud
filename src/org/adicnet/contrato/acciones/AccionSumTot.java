package org.adicnet.contrato.acciones;

import java.math.*;
import java.util.*;

import org.openxava.actions.*;

public class AccionSumTot extends ViewBaseAction{

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		
		BigDecimal total = new BigDecimal("0");
		try{
			       
			 		
			 		List purien = getView().getSubview("consultas").getCollectionValues();
			 		for(int i=0; purien.size()>i; i++){
			 			Map treos = (Map) purien.get(i);
			 			total = total.add(new BigDecimal(treos.get("totalConsulta")+"")); 	
			 		}
			 		getView().setValue("total", total);
			 		getView().refresh();
			 		}catch(org.openxava.util.ElementNotFoundException r){
			 		
			 		}
					 
		
		try{
			 		List purien = getView().getSubview("procedimientos").getCollectionValues();
			 		for(int i=0; purien.size()>i; i++){
			 			Map treos = (Map) purien.get(i);
			 			total = total.add(new BigDecimal(treos.get("total")+"")); 	
			 		}
			 		getView().setValue("total", total);
			 		getView().refresh();
			 		}catch(org.openxava.util.ElementNotFoundException r){
			 		
			 		}
	}

}
