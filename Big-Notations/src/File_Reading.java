public class File_Reading {
    public static void main(String[] args) {
        String filePath = "path/to/your/large/file.txt"; // Update with your file path

        long fileReaderTime = readUsingFileReader(filePath);
        long inputStreamReaderTime = readUsingInputStreamReader(filePath);

        System.out.println("Time taken using FileReader: " + fileReaderTime + " ms");
        System.out.println("Time taken using InputStreamReader: " + inputStreamReaderTime + " ms");
    }

    public static long readUsingFileReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.readLine() != null) {
                // Reading the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long readUsingInputStreamReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            while (bufferedReader.readLine() != null) {
                // Reading the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }
}