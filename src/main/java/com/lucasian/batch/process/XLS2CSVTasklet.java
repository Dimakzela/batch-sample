package com.lucasian.batch.process;

import java.io.File;
import java.io.PrintStream;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.eventusermodel.XLSX2CSV;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.core.io.Resource;

/**
*
* @author iamedu
*/
public class XLS2CSVTasklet implements Tasklet {

    private Resource inputResource;
    private String targetDirectory;
    private String targetFile;
    private int minColumns;

    public RepeatStatus execute(StepContribution sc, ChunkContext cc) throws Exception {
        try {
            File targetDirectoryAsFile = new File(
                    targetDirectory);
            if (!targetDirectoryAsFile.exists()) {
                FileUtils.forceMkdir(targetDirectoryAsFile);
            }
            File target = new File(targetDirectory, targetFile);
            PrintStream printStream = new PrintStream(target, "UTF-8");

            XLSX2CSV converter = new XLSX2CSV(OPCPackage.open(inputResource.getInputStream()), printStream, minColumns);

            converter.process();

            printStream.close();

            File newFile = new File(inputResource.getFile().getAbsolutePath().replace("-new", ""));

            if (!inputResource.getFile().getName().equals(newFile.getName())) {
                if (newFile.exists()) {
                    newFile.delete();
                }
                newFile = new File(inputResource.getFile().getAbsolutePath().replace("-new", ""));
                FileUtils.moveFile(inputResource.getFile(), newFile);
            }
        } catch(Exception ex) {
            if(inputResource.getFile().exists()) {
                inputResource.getFile().delete();
            }
            throw ex;
        }

        return RepeatStatus.FINISHED;
    }

    public Resource getInputResource() {
        return inputResource;
    }

    public void setInputResource(Resource inputResource) {
        this.inputResource = inputResource;
    }

    public String getTargetDirectory() {
        return targetDirectory;
    }

    public void setTargetDirectory(String targetDirectory) {
        this.targetDirectory = targetDirectory;
    }

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }

    public int getMinColumns() {
        return minColumns;
    }

    public void setMinColumns(int minColumns) {
        this.minColumns = minColumns - 1;
    }
}
