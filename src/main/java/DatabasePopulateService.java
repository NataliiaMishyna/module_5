import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DatabasePopulateService {
    public static void main(String[] args) throws SQLException, IOException {
            insertWorkerTable();
            insertClientTable();
            insertProjectTable();
            insertProjectWorkerTable();
     }

    public static void insertWorkerTable() throws IOException, SQLException{
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db.sql")));
         try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "1");
            preparedStatement.setString(2, "Іванов Іван Іванович");
            preparedStatement.setDate(3, Date.valueOf("1981-05-21"));
            preparedStatement.setString(4, "Trainee");
            preparedStatement.setInt(5, 1000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "Петров Петро Петрович");
            preparedStatement.setDate(3, Date.valueOf("1991-04-21"));
            preparedStatement.setString(4, "Trainee");
            preparedStatement.setInt(5, 2000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "Гулька Олена Василіївна");
            preparedStatement.setDate(3, Date.valueOf("1994-12-11"));
            preparedStatement.setString(4, "Junior");
            preparedStatement.setInt(5, 3000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "4");
            preparedStatement.setString(2, "Янович Євгеній Валерійович");
            preparedStatement.setDate(3, Date.valueOf("1990-11-01"));
            preparedStatement.setString(4, "Middle");
            preparedStatement.setInt(5, 4000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "5");
            preparedStatement.setString(2, "Василенко Василій Васильович");
            preparedStatement.setDate(3, Date.valueOf("1989-11-01"));
            preparedStatement.setString(4, "Senior");
            preparedStatement.setInt(5, 5000);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "6");
            preparedStatement.setString(2, "По Едгар");
            preparedStatement.setDate(3, Date.valueOf("1978-09-05"));
            preparedStatement.setString(4, "Trainee");
            preparedStatement.setInt(5, 1500);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "7");
            preparedStatement.setString(2, "Кінг Стівен");
            preparedStatement.setDate(3, Date.valueOf("1988-04-15"));
            preparedStatement.setString(4, "Middle");
            preparedStatement.setInt(5, 3500);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "8");
            preparedStatement.setString(2, "Шевченко Тарас Григорійович");
            preparedStatement.setDate(3, Date.valueOf("2000-05-17"));
            preparedStatement.setString(4, "Middle");
            preparedStatement.setInt(5, 3500);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "9");
            preparedStatement.setString(2, "Франко Іван");
            preparedStatement.setDate(3, Date.valueOf("2001-06-19"));
            preparedStatement.setString(4, "Senior");
            preparedStatement.setInt(5, 4500);
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "10");
            preparedStatement.setString(2, "Українка Леся");
            preparedStatement.setDate(3, Date.valueOf("1990-11-01"));
            preparedStatement.setString(4, "Senior");
            preparedStatement.setInt(5, 5000);
            preparedStatement.executeUpdate();

            //preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

    public static void insertClientTable() throws IOException, SQLException{
        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db_client.sql")));
        try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "1");
            preparedStatement.setString(2, "Клієнт1 Карпенко Карий");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "Клієнт2 Каленко Ліза");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "Клієнт3 Беренко Олена");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "4");
            preparedStatement.setString(2, "Клієнт4 Швец Валентин");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "5");
            preparedStatement.setString(2, "Клієнт5 Ярий Кирил");
            preparedStatement.executeUpdate();

            ///preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

    public static void insertProjectTable() throws IOException, SQLException{
        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db_project.sql")));
        try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "1");
            preparedStatement.setString(2, "3");
            preparedStatement.setDate(3, Date.valueOf("2021-12-01"));
            preparedStatement.setDate(4, Date.valueOf("2023-06-01"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "2");
            preparedStatement.setDate(3, Date.valueOf("2020-09-01"));
            preparedStatement.setDate(4, Date.valueOf("2024-05-01"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "1");
            preparedStatement.setDate(3, Date.valueOf("2019-11-01"));
            preparedStatement.setDate(4, Date.valueOf("2025-05-01"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "4");
            preparedStatement.setString(2, "5");
            preparedStatement.setDate(3, Date.valueOf("2020-10-01"));
            preparedStatement.setDate(4, Date.valueOf("2025-08-01"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "5");
            preparedStatement.setString(2, "4");
            preparedStatement.setDate(3, Date.valueOf("2021-01-01"));
            preparedStatement.setDate(4, Date.valueOf("2023-06-01"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "6");
            preparedStatement.setString(2, "4");
            preparedStatement.setDate(3, Date.valueOf("2021-02-01"));
            preparedStatement.setDate(4, Date.valueOf("2029-04-28"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "7");
            preparedStatement.setString(2, "4");
            preparedStatement.setDate(3, Date.valueOf("2019-12-01"));
            preparedStatement.setDate(4, Date.valueOf("2028-05-01"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "8");
            preparedStatement.setString(2, "5");
            preparedStatement.setDate(3, Date.valueOf("2021-12-01"));
            preparedStatement.setDate(4, Date.valueOf("2025-07-30"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "9");
            preparedStatement.setString(2, "1");
            preparedStatement.setDate(3, Date.valueOf("2022-12-01"));
            preparedStatement.setDate(4, Date.valueOf("2024-08-10"));
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "10");
            preparedStatement.setString(2, "2");
            preparedStatement.setDate(3, Date.valueOf("2023-01-01"));
            preparedStatement.setDate(4, Date.valueOf("2026-06-30"));
            preparedStatement.executeUpdate();

            //preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

    public static void insertProjectWorkerTable() throws IOException, SQLException{
        Database database = Database.getInstance();
        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/populate_db_project_worker.sql")));
        try {
            Connection conn = Database.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "1");
            preparedStatement.setString(2, "3");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "2");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "1");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "3");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "4");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, "10");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "4");
            preparedStatement.setString(2, "5");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "5");
            preparedStatement.setString(2, "7");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "6");
            preparedStatement.setString(2, "8");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "7");
            preparedStatement.setString(2, "6");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "8");
            preparedStatement.setString(2, "5");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "9");
            preparedStatement.setString(2, "1");
            preparedStatement.executeUpdate();

            preparedStatement.setString(1, "10");
            preparedStatement.setString(2, "2");
            preparedStatement.executeUpdate();

            //preparedStatement.close();
            //conn.close();
        }
        catch (SQLException se){
            throw se;
        }
    }

}
