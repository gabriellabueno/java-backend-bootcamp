package sql.mariadb.app;

import java.sql.*;

public class MariadbConnection  {
    public static void main( String[] args ) {

        Connection conn = null; // Cria objeto de conexão

        // Configurações do BD
        String dbServer = "mariadb-179713-0.cloudclusters.net";
        int dbPort = 19101;
        String dbName = "school";
        String userName = "admin";
        String password = "";

        // Formatação da String SQL
        String url = String.format("jdbc:mariadb://%s:%d/%s?user=%s&password=%s",
                                    dbServer, dbPort, dbName, userName, password);

        try {
            conn = DriverManager.getConnection(url); // Abre conexão
            Statement stmt = conn.createStatement(); // Cria objeto para execução das instruções SQL

            // Cria tabela
            String sql = "CREATE TABLE teacher(NO CHAR(20), name VARCHAR(20), PRIMARY KEY(NO))";
            int result = stmt.executeUpdate(sql);

            // Insere Dados
            if(result != 1) { // Certifica que a tabela foi criada
                sql = "INSERT INTO teacher(NO, name) VALUES('201001', 'john')";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO teacher(NO, name) VALUES('201002', 'mary')";
                stmt.executeUpdate(sql);
            }

            // Adiciona coluna na tabela
            sql = "ALTER TABLE teacher ADD subject CHAR(20)";
            stmt.executeUpdate(sql);

            // Consulta Dados
            sql = "UPDATE teacher SET subject = 'math' WHERE NO = '201001'";
            stmt.executeUpdate(sql);
            sql = "UPDATE teacher SET subject = 'history' WHERE NO = '201002'";
            stmt.executeUpdate(sql);

            sql = "select * from teacher";
            ResultSet rs = stmt.executeQuery(sql); // Executa instrução, retorna dados
            System.out.println("No.\tName \tSubject");

            while (rs.next()) { // Loop para printar dados
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("Connection had an exception");
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                conn.close(); // Fecha conexão
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

