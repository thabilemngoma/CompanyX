import org.springframework.data.jpa.repository.JpaRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ClientJdbcRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class ClientRowMapper implements RowMapper<Client> {
        @Override
        public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
            Client student = new Client();
            client.setId(rs.getLong("id"));
            client.setName(rs.getString("name"));
            client.setSurname(rs.getString("surname"));
            return Client;
        }

    }

    public List<Client> findAll() {
        return jdbcTemplate.query("select * from client", new ClientRowMapper());
    }

    public Client findById(long id) {
        return jdbcTemplate.queryForObject("select * from client where id=?", new Object[] { id },
                new BeanPropertyRowMapper<Client>(Client.class));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from client where id=?", new Object[] { id });
    }

    public int insert(client client) {
        return jdbcTemplate.update("insert into client (id, name, surname) " + "values(?,  ?, ?)",
                new Object[] { client.getId(), client.getName(), client.getSurname() });
    }

    public int update(Client client) {
        return jdbcTemplate.update("update client " + " set name = ?, surname = ? " + " where id = ?",
                new Object[] { client.getName(), client.getSurname(), client.getId() });
    }

}