package pampas.basedato.repositorio;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pampas.basedato.modelo.Asignaturas;

public class AsignaturaRepositorioImpl implements Repositorio<Asignaturas>{

	private Connection conn;
	
	public AsignaturaRepositorioImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public List<Asignaturas> listar() {
		// TODO Auto-generated method stub
		List<Asignaturas> Asignaturas = new ArrayList<Asignaturas>();
		
		try (Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM asignaturas")){
			
			while (rs.next()) {
				Asignaturas a = crearAsignaturas(rs);
				Asignaturas.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Asignaturas;
	}
	
	@Override
	public Asignaturas porId(Long id) {
		// TODO Auto-generated method stub
		Asignaturas asignaturas = null;
		try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM asignaturas WHERE idAsignatura=?")) {
			stmt.setLong(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if(rs.next()) {
					asignaturas = crearAsignaturas(rs);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return asignaturas;
	}

	@Override
	public void guardar(Asignaturas asignaturas) {
		// TODO Auto-generated method stub
		
		String sql;
		if (asignaturas.getIdAsignatura() != null && asignaturas.getIdAsignatura() > 0) {
			sql = "UPDATE asignaturas SET nombreAsignatura=?, materiaAsignatura=?, correlatividad=?, añoAsignatura=?, obligatorio=? WHERE idAsignatura=?";
		} else {
			sql = "INSERT INTO asignaturas(nombreAsignatura, materiaAsignatura, correlatividad, añoAsignatura, obligatorio) VALUES(?, ?, ?, ?, ?)";
		}
		
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, asignaturas.getNombreAsignatura());
			stmt.setString(2, asignaturas.getMateriaAsignatura());
			stmt.setString(2, asignaturas.getMateriaAsignatura());
			stmt.setDate(2, asignaturas.getAñoAsignatura());
			stmt.setBoolean(2, asignaturas.isObligatorio());
			
			if (asignaturas.getIdAsignatura() != null && asignaturas.getIdAsignatura() > 0) {
				stmt.setLong(3, asignaturas.getIdAsignatura());
			} else {
				stmt.setDate(3, new Date(asignaturas.getAñoAsignatura().getTime()));
			}
			
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM asignaturas WHERE idAsignatura=?")) {
			stmt.setLong(1, id);
			stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	} 
	
	private Asignaturas crearAsignaturas(ResultSet rs) throws SQLException {
			Asignaturas a = new Asignaturas();
			a.setNombreAsignatura(rs.getString("nombreAsignatura"));
			a.setMateriaAsignatura(rs.getString("materiaAsignatura"));
			a.setCorrelatividad(rs.getString("correlatividad"));
			a.setAñoAsignatura(rs.getDate("añoAsignatura"));
			a.setObligatorio(rs.getBoolean("obligatorio"));
			return a;
	}
}
