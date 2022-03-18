package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private MariaDbDataSource dataSource;

    public DogTypes(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        try(Connection con = dataSource.getConnection();
            PreparedStatement ps = con.prepareStatement("select name from dog_types where country = ? order by name")) {
            ps.setString(1, country.toUpperCase());
            return getNames(ps);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach database!");
        }
    }

    private List<String> getNames(PreparedStatement ps) throws SQLException {
        try(ResultSet rs = ps.executeQuery()) {
            List<String> dogTypes = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("name");
                dogTypes.add(name.toLowerCase());
            }
            return dogTypes;
        }
    }
}

