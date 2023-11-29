//Code To Read A CSV file
package JavaFileIO;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV {
    public static void main(String[] args) {
        String pathToCSV = "/Users/indigyal/Desktop/myCSV.csv";

        try (CSVReader csvReader = new CSVReader(new FileReader(pathToCSV))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                for (String cell : values) {
                    System.out.println(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        writeCSV();
        AddmoreData();
    }
    public static void writeCSV(){
        String filePath = "/Users/indigyal/Desktop/myCSV.csv";
        String[] headers = {"ID", "Name", "Age", "Country"};
        String[][] data = {
                {"1", "Alice", "23", "USA"},
                {"2", "Bob", "30", "UK"},
                {"3", "Charlie", "35", "Canada"}

        };
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            //Writing headers
            writer.write(String.join(",", headers));
            writer.newLine();

            //Writing data
            for(String[] record : data) {
                writer.write(String.join(",", record));
                writer.newLine();
            }
            System.out.println("CSV file has been written to desktop.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void AddmoreData(){
        String filePath = "/Users/indigyal/Desktop/myCSV.csv";
        String[][] additionaldata= {
                {"4", "Adam", "23", "USA"},
                {"5", "Boby", "30", "UK"},
                {"6", "Cha cha", "35", "Canada"}

        };
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            //Writing additional data
            for (String[] record : additionaldata) {
                writer.newLine();
                writer.write(String.join(",", record));
            }
            System.out.println("CSV file has been written to desktop.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
