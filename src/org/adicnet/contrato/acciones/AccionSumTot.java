package org.adicnet.contrato.acciones;

import java.math.*;
import java.util.*;

import org.openxava.actions.*;

public class AccionSumTot extends ViewBaseAction{

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		try{
			        System.out.println("se empieza a ejecutar");
			 		BigDecimal total = new BigDecimal("0");
			 		List purien = getView().getSubview("consultas").getCollectionValues();
			 		for(int i=0; purien.size()>i; i++){
			 			Map treos = (Map) purien.get(i);
			 			total = total.add(new BigDecimal(treos.get("totalConsulta")+"")); 	
			 		}
			 		getView().setValue("total", total);
			 		getView().refresh();
			 		}catch(org.openxava.util.ElementNotFoundException r){
			 			System.out.println("ocurre error");
			 		}
					 		
	}

}
