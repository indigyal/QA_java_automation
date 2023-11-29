package JDBC;

public class calls {
    public static void main(String[] args) {
        JDBC.Operations operations = new Operations();

//        String selectQuery = "SELECT * fROM qaauto";
//        operations.readData(selectQuery);

//        String insertQuery = "INSERT INTO QAAUTO(name,email,class,phone)" +
//                "VALUES('Micheal Smith','m.smith@gmail.com','QA OCT 2023',212-234-5678)";
//        operations.writeData(insertQuery);

        String deleteQuery = "DELETE FROM QAAUTO WHERE id = '15'";
        operations.deleteData(deleteQuery);

//        String updateQuery = "UPDATE qaauto SET column2 = ? WHERE column1 =?";
//        operations.updateData(updateQuery, "QAauto", "John Doe");

        connection.closeConnection();
    }

}


