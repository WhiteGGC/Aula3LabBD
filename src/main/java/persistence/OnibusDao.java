package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Onibus;

public class OnibusDao {
	
	private GenericDao gDao;
	
	public OnibusDao(GenericDao gDao) {
		this.gDao = gDao;
	}
	
	public Onibus consultaOnibus(Onibus o) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "SELECT * FROM v_descricao_onibus WHERE codigo_viagem = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, o.getCodigo());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			o.setCodigo(rs.getInt("codigo_viagem"));
			o.setNomeMotorista(rs.getString("nome_motorista"));
			o.setPlaca(rs.getString("placa_onibus"));
			o.setMarca(rs.getString("marca_onibus"));
			o.setAno(rs.getInt("ano_onibus"));
			o.setDescricao(rs.getString("descricao_onibus"));
		}
		
		rs.close();
		ps.close();
		c.close();
		
		return o;
	}
	
}
