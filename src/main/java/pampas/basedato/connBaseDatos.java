package pampas.basedato;

import java.sql.*;
import java.util.Date;

import pampas.basedato.repositorio.*;
import pampas.basedato.modelo.Asignaturas;
import pampas.basedato.repositorio.Repositorio;
import pampas.basedato.util.ConexionBaseDatos;

public class connBaseDatos {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connBD = (Connection) ConexionBaseDatos.getInstance();
		try {
				if(connBD.getAutoCommit()) {
					connBD.setAutoCommit(false);
				}
				Repositorio<Asignaturas> asignatura = new AsignaturaRepositorioImpl(connBD); //este cast para mi esta mal
				try {
					System.out.println("============ listar ============");
					asignatura.listar().forEach(System.out::println);
					
					System.out.println("============ obtener por id ============");
					System.out.println(asignatura.porId(2L));
					
					System.out.println("============ insertar nueva Asignaturas ============");
					Asignaturas asignaturas = new Asignaturas();
					asignaturas.setNombreAsignatura("hola");
					asignaturas.setMateriaAsignatura("chau");
					asignaturas.setCorrelatividad("alguna");
					asignaturas.setAñoAsignatura((java.sql.Date) new Date());
					asignaturas.setObligatorio(true);
					asignatura.guardar(asignaturas);
					System.out.println("============ producto guardado con exito ============");
					asignatura.listar().forEach(System.out::println);
					
					connBD.commit();
				} catch (SQLException e) {
					// TODO: handle exception
					connBD.rollback();
					e.printStackTrace();
				}
				System.out.println("============ editar/actulizar nuevo producto ============");
				Asignaturas asign = new Asignaturas();
				asign.setIdAsignatura(3L);
				asign.setNombreAsignatura("teclado razer mecanico");
				asign.setMateriaAsignatura("");
				asign.setCorrelatividad("");
				asign.setAñoAsignatura(null);
				asign.setObligatorio(true);
				asignatura.guardar(asign);
				System.out.println("============ producto actualizado con exito ============");
				asignatura.listar().forEach(System.out::println);
				
				System.out.println("============ eliminar producto ============");
				asignatura.eliminar(3L);
				System.out.println("============ producto eliminado con exito ============");
				asignatura.listar().forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
