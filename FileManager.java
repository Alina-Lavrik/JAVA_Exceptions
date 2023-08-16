
/* Задача 2: Файловый менеджер (ООП, исключения)

Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами: чтение, запись и копирование. 
Каждый из этих методов должен выбрасывать соответствующее исключение, 
если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).*/
import java.io.*;

public class FileManager {

    public String read(String fileName) throws FileNotFoundException, IOException {

        FileReader fileR = new FileReader(fileName); // создали объект для чтения файла

        BufferedReader bufferR = new BufferedReader(fileR); // создали буффер для чтения данных из файла

        String st = ""; // строка для храниения считанного содержимого файла

        try {
            String line;

            while ((line = bufferR.readLine()) != null) {
                st += line + "x";
            }
            } finally {
            bufferR.close();
            fileR.close();
        } 
        return st;

    }

    public void write(String fileName, String st) throws IOException {

        FileWriter fileW = new FileWriter(fileName);

        try { fileW.write(st); 
        } finally {

        fileW.close();
        }
    }

    public void copy(String sourseFileName, String destinationFileName) throws IOException {

        FileInputStream fileIS = new FileInputStream(sourseFileName);

        FileOutputStream fileOS = new FileOutputStream(destinationFileName);

        byte[] buffer = new byte[1024];
        int byteRead;

        try{
            while((byteRead = fileIS.read(buffer)) != -1){
                fileOS.write(buffer, 0, byteRead);

            }
        } finally {
            fileIS.close();
            fileOS.close();
        }

    }



}