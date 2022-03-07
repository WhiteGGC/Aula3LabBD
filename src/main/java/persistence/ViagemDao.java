package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Viagem;

public class ViagemDao {
	
	private GenericDao gDao;
	
	public ViagemDao(GenericDao gDao) {
		this.gDao = gDao;
	}
	
	public Viagem consultaViagem(Viagem v) throws SQLException, ClassNotFoundException {
		Connection c = gDao.getConnection();
		String sql = "SELECT * FROM v_descricao_viagem WHERE codigo = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, v.getId());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			v.setId(rs.getInt("codigo"));
			v.setPlacaOnibus(rs.getString("placa_onibus"));
			v.setHoraSaida(rs.getString("hora_saida"));
			v.setHoraChegada(rs.getString("hora_chegada"));
			v.setPartida(rs.getString("partida"));
			v.setDestino(rs.getString("destino"));
		}
		
		rs.close();
		ps.close();
		c.close();
		
		return v;
	}
	
}
