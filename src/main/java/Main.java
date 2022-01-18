import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String databaseUrl = "jdbc:h2:mem:entry";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        ConnectionSource connectionSource2 = new JdbcConnectionSource(databaseUrl);
        Dao<Entry, String> dao = DaoManager.createDao(connectionSource, Entry.class);
        Dao<Entry, String> dao2 = DaoManager.createDao(connectionSource2, Entry.class);
        TableUtils.createTable(connectionSource, Entry.class);
        dao.create(new Entry("Pete"));
        dao.create(new Entry("John"));
        dao.create(new Entry("Alice"));
        dao2.queryForAll().forEach(System.out::println);
    }

}
