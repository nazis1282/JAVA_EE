package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Projet> getProjetsParMotCle(String mc) {
		List<Projet> prods = new ArrayList<Projet>();
		Connection conn = SingletonConnection.getConnection();
		try {

			PreparedStatement ps = conn.prepareStatement("select * from PROJETS where NOM_PROJET LIKE ?");

			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Projet p = new Projet();
				p.setIdProjet(rs.getLong("ID_PROJET"));
				p.setNomProjet(rs.getString("NOM_PROJET"));
				p.setCout(rs.getDouble("COUT"));
				prods.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public void addProjet(Projet p) {
// TODO Auto-generated method stub
	}
}