import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void copyFile(String sourceFile, String FileOutputStream) {
        File sFile = new File(sourceFile);
        File dFile = new File(FileOutputStream);
        if (!sFile.exists()) {
            try {
                if (sFile.createNewFile()) {
                    System.out.println("*******************");
                    System.out.println("Error message: ");

                    System.out.println("Source file not found. A new source file has been created: " + sourceFile);
                    return; // Exit as there's no meaningful content to copy
                }

            } catch (IOException e) {
                System.out.println("Error creating source file: " + e.getMessage());
                return;
            }

        }
        try (
                FileInputStream fis = new FileInputStream(sFile);
                FileOutputStream fos = new FileOutputStream(dFile);) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        String source = "source.txt";
        String destination = "destination.txt";

        // Call the copyFile method
        copyFile(source, destination);

    }

}
