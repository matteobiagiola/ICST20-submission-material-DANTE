package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class ResetAppState {

    public static void main(String[] args) {
        reset();
    }

    public static void reset(){
        clearDB("postgres","postgres",
                "phoenix_trello_dev",
                Integer.valueOf(Properties.getInstance().getProperty("db_port")));
    }

    private static void clearDB(String username, String password, String dbName, int port){
        restore(username, password, dbName, port, "false");
    }

    private static void restore(String username, String password, String dbName,
                                int port, String ssl){
        Optional<Connection> optionalConnection = connect(username, password,
                dbName, port, ssl);
        if(optionalConnection.isPresent()){
            Connection connection = optionalConnection.get();
            try {
                Statement st = connection.createStatement();
                st.executeUpdate("truncate table boards cascade;");
                st.executeUpdate("truncate table card_members cascade;");
                st.executeUpdate("truncate table cards cascade;");
                st.executeUpdate("truncate table comments cascade;");
                st.executeUpdate("truncate table lists cascade;");
                st.executeUpdate("truncate table schema_migrations cascade;");
                st.executeUpdate("truncate table user_boards cascade;");
                st.executeUpdate("truncate table users cascade;");

                st.executeUpdate("INSERT INTO public.users (id, first_name, last_name, email, " +
                        "encrypted_password, inserted_at, updated_at) VALUES (57, 'John', 'Doe', " +
                        "'john@phoenix-trello.com', '$2b$12$Ptnoc/IyfWMIOFWrworbu.f6UJ1AAVHwGgQwLnk5AS8NnJ5XVyvU2', " +
                        "'2019-04-13 11:54:32', '2019-04-13 11:54:32');");


                st.executeUpdate("INSERT INTO public.boards (id, name, user_id, inserted_at, " +
                        "updated_at, slug) VALUES (7, 'phoenix board', 57, " +
                        "'2019-04-13 09:54:49', '2019-04-13 09:54:49', 'phoenix-board');");
                st.executeUpdate("INSERT INTO public.boards (id, name, user_id, inserted_at, " +
                        "updated_at, slug) VALUES (8, 'other phoenix board', 57, '2019-04-13 09:56:45', " +
                        "'2019-04-13 09:56:45', 'other-phoenix-board');");

                st.executeUpdate("INSERT INTO public.user_boards (id, user_id, board_id, inserted_at," +
                        " updated_at) VALUES (10, 57, 7, '2019-04-13 09:54:49', '2019-04-13 09:54:49');");
                st.executeUpdate("INSERT INTO public.user_boards (id, user_id, board_id, inserted_at, " +
                        "updated_at) VALUES (11, 57, 8, '2019-04-13 09:56:45', '2019-04-13 09:56:45');");

                st.executeUpdate("INSERT INTO public.lists (id, name, \"position\", board_id, " +
                        "inserted_at, updated_at) VALUES (4, 'phoenix list', 1024, 7, '2019-04-13 09:54:56', " +
                        "'2019-04-13 09:54:56');");
                st.executeUpdate("INSERT INTO public.lists (id, name, \"position\", board_id, " +
                        "inserted_at, updated_at) VALUES (5, 'other phoenix list', 1024, 8, " +
                        "'2019-04-13 09:56:50', '2019-04-13 09:56:50');");
                st.executeUpdate("INSERT INTO public.cards (id, name, \"position\", list_id, " +
                        "inserted_at, updated_at, description, tags) VALUES (3, 'phoenix card', 1024, 4, " +
                        "'2019-04-13 09:55:03', '2019-04-13 09:55:03', NULL, '{}');");
                st.executeUpdate("INSERT INTO public.cards (id, name, \"position\", list_id, " +
                        "inserted_at, updated_at, description, tags) VALUES (4, 'other phoenix card', " +
                        "1024, 5, '2019-04-13 09:57:00', '2019-04-13 09:57:00', NULL, '{}');");
                st.executeUpdate("INSERT INTO public.comments (id, text, user_id, card_id, inserted_at, " +
                        "updated_at) VALUES (3, 'phoenix comment', 57, 3, '2019-04-13 09:56:05', " +
                        "'2019-04-13 09:56:05');");


                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            throw new IllegalStateException("Connection failed");
        }
    }


    private static void reset(String username, String password, String dbName,
                              int port, String ssl){
        Optional<Connection> optionalConnection = connect(username, password,
                dbName, port, ssl);
        if(optionalConnection.isPresent()){
            Connection connection = optionalConnection.get();
            try {
                Statement st = connection.createStatement();
                st.executeUpdate("truncate table boards cascade;");
                st.executeUpdate("truncate table card_members cascade;");
                st.executeUpdate("truncate table cards cascade;");
                st.executeUpdate("truncate table comments cascade;");
                st.executeUpdate("truncate table lists cascade;");
                st.executeUpdate("truncate table schema_migrations cascade;");
                st.executeUpdate("truncate table user_boards cascade;");
                st.executeUpdate("truncate table users cascade;");
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                st.executeUpdate("insert into users (first_name,last_name,email,encrypted_password,inserted_at,updated_at) VALUES ('John', 'Doe', 'john@phoenix-trello.com', '$2b$12$Ptnoc/IyfWMIOFWrworbu.f6UJ1AAVHwGgQwLnk5AS8NnJ5XVyvU2','" + dateFormat.format(date) + "'," + "'" + dateFormat.format(date) + "')");
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            throw new IllegalStateException("Connection failed");
        }
    }

    private static Optional<Connection> connect(String user, String password,
                                                String dbName, int port, String ssl){
        String url = "jdbc:postgresql://localhost:" + port + "/" + dbName
                + "?user=" + user + "&password=" + password + "&ssl=" + ssl;
        try {
            Connection conn = DriverManager.getConnection(url);
            return Optional.of(conn);
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
