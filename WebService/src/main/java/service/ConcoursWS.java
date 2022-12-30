package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import dao.Etudiantdao;
import metier.Etudiant;

@WebService
public class ConcoursWS {
	
	@WebMethod
	public int IsAccepted(@WebParam (name="CNI")String cni) {
		
		Etudiantdao service = new Etudiantdao();
		Etudiant e = service.findONE(cni);
		if(e == null) {
			return -1;
		}
		
		if (e.getGrades().getMaths() >= 12 && e.getGrades().getPhysiques() >= 12 && e.getGrades().getArabe() >= 12 && e.getGrades().getAnglais() >= 12) {
			return 1;
		}
		return 0;
	}

}
