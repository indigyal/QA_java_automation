package JDBC;

import java.sql.*;

public class Operations {
    public void readData(String query, Object... parameters) {
        try (Connection conn = connection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(", ");
                    String columnValue = resultSet.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void writeData(String query, Object... parameters) {
        try (Connection conn = connection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            int i = 1;
            for (Object parameter : parameters) {
                preparedStatement.setObject(i++, parameter);
            }

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + "rows inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteData(String query, Object... parameters) {
        try (Connection conn = connection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            int i = 1;
            for (Object parameter : parameters) {
                preparedStatement.setObject(i++, parameter);
            }

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + "row(s) deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateData(String query, Object... parameters) {
        try (Connection conn = connection.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            int i = 1;
            for (Object parameter : parameters) {
                preparedStatement.setObject(i++, parameter);
            }

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
