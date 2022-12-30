package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import metier.Etudiant;
import metier.Notes;
import singleton.Singleton;


public class Etudiantdao {
	
	public Etudiant findONE(String cni) {
	Etudiant etudiant = null;
	Notes notes = null;
	try {

		Connection conn = Singleton.getInstance().getConnection();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM etudiant,notes WHERE CNI = ? AND etudiant.notes = notes.id");
		stmt.setString(1, cni);
		ResultSet result = stmt.executeQuery();
		if (result.next()) {
			String CNI = result.getString("CNI");
			String CNE = result.getString("CNE");
			int NOTES = result.getInt("notes");
			int id = result.getInt("id");
			double Maths = result.getDouble("Maths");
			double Physique = result.getDouble("Physique");
			double Arabe = result.getDouble("Arabe");
			double Anglais = result.getDouble("Anglais");
			
			notes = new Notes(id,Maths,Physique,Arabe,Anglais);
			etudiant = new Etudiant(CNI, CNE, notes);
		}
	} catch (SQLException ex) {
		System.out.println("Erreur SQL : " + ex.getMessage());
	}
	return etudiant;
	
	}
}
