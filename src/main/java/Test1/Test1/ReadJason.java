package Test1.Test1;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJason{
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File("student.json");

            JsonNode studentData = objectMapper.readTree(jsonFile);

            System.out.println("Student Details");
            System.out.println("--------");
            System.out.println("Name: " + studentData.get("name").asText());
            System.out.println("Age: " + studentData.get("age").asInt());
            System.out.println("Department: " + studentData.get("department").asText());
            System.out.println("College: " + studentData.get("college").asText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
