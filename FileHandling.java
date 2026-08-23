import java.io.*;
public class FileCopy {
public static void main(String[] args) {
try {
FileInputStream input = new FileInputStream("input.txt");
FileOutputStream output = new FileOutputStream("output.txt");
int data;
while ((data = input.read()) != -1) {
output.write(data);
}
input.close();
output.close();
System.out.println("File copied successfully.");
System.out.println("Destination File Created: output.txt");
}
catch (IOException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
