package server;

import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.LinkedList;

public class Server {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server connected!");
                try {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("The client connected to the server!");
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream()); 
                    ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
                    while (true){
                        String request = in.readLine();
                        System.out.println("Customer request: " + request); // Отладочное сообщение
                        if ("selectPost".equals(request)) {
                            try {
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery("SELECT * FROM Postoyalec");
                                LinkedList<String> answer = new LinkedList<>();
                                while (rs.next()) {
                                    answer.add(rs.getString("ID_Postoyalca"));
                                    answer.add(rs.getString("Surname"));
                                    answer.add(rs.getString("Name"));
                                    answer.add(rs.getString("Patronymic"));
                                    answer.add(rs.getString("Passport"));
                                    answer.add(rs.getString("Address"));
                                    answer.add(rs.getString("Comment"));
                                    answer.add(rs.getString("Category"));
                                    answer.add(rs.getString("Discount"));
                                }
                               oos.writeObject(answer);
                               oos.flush();
                               stmt.close();
                               conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        if ("addPost".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            Statement stmt = conn.createStatement();
                            LinkedList<String> answer = new LinkedList<String>();
                            answer = (LinkedList<String>) ois.readObject();
                            String sql = "INSERT INTO Postoyalec VALUES("+answer.get(0)+",'"
                                    +answer.get(1)+"','"
                                    +answer.get(2)+"','"
                                    +answer.get(3)+"','"
                                    +answer.get(4)+"','"
                                    +answer.get(5)+"','"
                                    +answer.get(6)+"','"
                                    +answer.get(7)+"','"
                                    +answer.get(8)+"');";
                            stmt.executeUpdate(sql);
                            stmt.close();
                            conn.close();
                        }
                        if ("delPost".equals(request)){
                            try {
                                String id = in.readLine();
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                String sql = "DELETE FROM Postoyalec WHERE ID_Postoyalca=" + id + ";";
                                stmt.executeUpdate(sql);
                                stmt.close();
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if("updatePost".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            LinkedList<String> answer = new LinkedList<>();
                            Statement stmt = conn.createStatement();
                            String sql = "DELETE FROM Postoyalec;";
                            stmt.executeUpdate(sql);
                            answer = (LinkedList<String>) ois.readObject();
                            for (int i = 0; i < answer.size(); i = i + 9) {
                                String sqlupd = "INSERT INTO Postoyalec VALUES("+answer.get(i)+",'"
                                    +answer.get(i+1)+"','"
                                    +answer.get(i+2)+"','"
                                    +answer.get(i+3)+"','"
                                    +answer.get(i+4)+"','"
                                    +answer.get(i+5)+"','"
                                    +answer.get(i+6)+"','"
                                    +answer.get(i+7)+"','"
                                    +answer.get(i+8)+"');";
                                stmt.executeUpdate(sqlupd);
                            }
                            stmt.close();
                            conn.close();
                        }
                   
                        if ("selectCheck".equals(request)) {
                            try {Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery("SELECT * FROM Check_in");
                                LinkedList<String> answer = new LinkedList<>();
                                while (rs.next()) {
                                    answer.add(rs.getString("ID_PostoyalcaC"));
                                    answer.add(rs.getString("Number_apartC"));
                                    answer.add(rs.getString("Date Check_in"));
                                    answer.add(rs.getString("Date Check_out"));
                                }
                               oos.writeObject(answer);
                               oos.flush();
                               stmt.close();
                               conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        if ("addCheck".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            Statement stmt = conn.createStatement();
                            LinkedList<String> answer = new LinkedList<String>();
                            answer = (LinkedList<String>) ois.readObject();
                            String sql = "INSERT INTO Check_in (ID_PostoyalcaC, Number_apartC, `Date Check_in`,`Date Check_out`) VALUES("+answer.get(0)+",'"
                                    +answer.get(1)+"','"
                                    +answer.get(2)+"','"
                                    +answer.get(3)+"');";
                            stmt.executeUpdate(sql);
                            stmt.close();
                            conn.close();
                        }
                        if ("delCheck".equals(request)){
                            try {
                                String id = in.readLine();
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                String sql = "DELETE FROM Check_in WHERE ID_PostoyalcaC=" + id + ";";
                                stmt.executeUpdate(sql);
                                stmt.close();
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if("updateCheck".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            LinkedList<String> answer = new LinkedList<>();
                            Statement stmt = conn.createStatement();
                            String sql = "DELETE FROM Check_in;";
                            stmt.executeUpdate(sql);
                            answer = (LinkedList<String>) ois.readObject();
                            for (int i = 0; i < answer.size(); i = i + 4) {
                                String sqlupd = "INSERT INTO Check_in VALUES("+answer.get(i)+",'"
                                    +answer.get(i+1)+"','"
                                    +answer.get(i+2)+"','"
                                    +answer.get(i+3)+"');";
                                stmt.executeUpdate(sqlupd);
                            }
                            stmt.close();
                            conn.close();
                        }
                        if ("selectReserv".equals(request)) {
                            try {Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery("SELECT * FROM Reservation");
                                LinkedList<String> answer = new LinkedList<>();
                                while (rs.next()) {
                                    answer.add(rs.getString("ID_PostoyalcaR"));
                                    answer.add(rs.getString("Number_apartR"));
                                    answer.add(rs.getString("Booking start date"));
                                    answer.add(rs.getString("Booking finish date"));
                                }
                               oos.writeObject(answer);
                               oos.flush();
                               stmt.close();
                               conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        if ("addReserv".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            Statement stmt = conn.createStatement();
                            LinkedList<String> answer = new LinkedList<String>();
                            answer = (LinkedList<String>) ois.readObject();
                            String sql = "INSERT INTO Reservation (ID_PostoyalcaR, Number_apartR, `Booking start date`,`Booking finish date`) VALUES("+answer.get(0)+",'"
                                    +answer.get(1)+"','"
                                    +answer.get(2)+"','"
                                    +answer.get(3)+"');";
                            stmt.executeUpdate(sql);
                            stmt.close();
                            conn.close();
                        }
                        if ("delReserv".equals(request)){
                            try {
                                String id = in.readLine();
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                String sql = "DELETE FROM Reservation WHERE ID_PostoyalcaR=" + id + ";";
                                stmt.executeUpdate(sql);
                                stmt.close();
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if("updateReserv".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            LinkedList<String> answer = new LinkedList<>();
                            Statement stmt = conn.createStatement();
                            String sql = "DELETE FROM Reservation;";
                            stmt.executeUpdate(sql);
                            answer = (LinkedList<String>) ois.readObject();
                            for (int i = 0; i < answer.size(); i = i + 4) {
                                String sqlupd = "INSERT INTO Reservation VALUES("+answer.get(i)+",'"
                                    +answer.get(i+1)+"','"
                                    +answer.get(i+2)+"','"
                                    +answer.get(i+3)+"');";
                                stmt.executeUpdate(sqlupd);
                            }
                            stmt.close();
                            conn.close();
                        }
                        if ("selectApart".equals(request)) {
                            try {Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery("SELECT * FROM Apart");
                                LinkedList<String> answer = new LinkedList<>();
                                while (rs.next()) {
                                    answer.add(rs.getString("Number_apart"));
                                    answer.add(rs.getString("Capacity"));
                                    answer.add(rs.getString("Comfort"));
                                    answer.add(rs.getString("Price"));
                                    answer.add(rs.getString("Free"));
                                }
                               oos.writeObject(answer);
                               oos.flush();
                               stmt.close();
                               conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        if ("addApart".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            Statement stmt = conn.createStatement();
                            LinkedList<String> answer = new LinkedList<String>();
                            answer = (LinkedList<String>) ois.readObject();
                            String sql = "INSERT INTO Apart (Number_apart, Capacity, Comfort, Price, Free) VALUES("+answer.get(0)+",'"
                                    +answer.get(1)+"','"
                                    +answer.get(2)+"','"
                                    +answer.get(3)+"','"
                                    +answer.get(4)+"');";
                            stmt.executeUpdate(sql);
                            stmt.close();
                            conn.close();
                        }
                        if ("delApart".equals(request)){
                            try {
                                String id = in.readLine();
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                                Statement stmt = conn.createStatement();
                                String sql = "DELETE FROM Apart WHERE Number_apart=" + id + ";";
                                stmt.executeUpdate(sql);
                                stmt.close();
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if("updateApart".equals(request)){
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
                            LinkedList<String> answer = new LinkedList<>();
                            Statement stmt = conn.createStatement();
                            String sql = "DELETE FROM Apart;";
                            stmt.executeUpdate(sql);
                            answer = (LinkedList<String>) ois.readObject();
                            for (int i = 0; i < answer.size(); i = i + 5) {
                                String sqlupd = "INSERT INTO Apart VALUES("+answer.get(i)+",'"
                                    +answer.get(i+1)+"','"
                                    +answer.get(i+2)+"','"
                                    +answer.get(i+3)+"','"
                                    +answer.get(i+4)+"');";
                                stmt.executeUpdate(sqlupd);
                            }
                            stmt.close();
                            conn.close();
                        }
                        if ("END".equals(request)) break;
                    }
                    clientSocket.close();
            } catch (IOException e) {
               e.printStackTrace();
               }
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
