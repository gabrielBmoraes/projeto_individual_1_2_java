package projetoIndividual;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UsuarioDao {
    private JdbcTemplate con;

    public UsuarioDao(JdbcTemplate con) {
        this.con = con;
    }

    public List<Usuario> selectAllUsuarios(){
        return.con.query("Select * from");
    }
}
