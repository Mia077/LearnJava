package teckwil.com.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File fileObject = new File("src/main/java/teckwil/com/filemanagementservice/test.txt");

        FileManager.informIfTheFileExists(fileObject);
        FileManager.createTheFileIfItDoesntExist(fileObject);
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printIfTheFileIsADirectoryOrNot(fileObject);
        FileManager.printTheFileAbsolutePath(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.deleteTheFileIfExists(fileObject);

        String filePath = "src/main/java/teckwil/com/filemanagementservice/testOutput.txt";
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filePath, "continut 1");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filePath, "Continut 2");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFileUsingFiles(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFile(fileObjectUsedForReading);

    }
}
