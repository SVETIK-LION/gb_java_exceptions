package Program;


import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser();
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parser.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parser.parsInputData();
            }
        }

        String newFileName = data.get("lastName") + ".txt"; // Файл, куда запишутся данные
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        writeFile.writeData(String.valueOf(sb), newFileName);

    }
}
