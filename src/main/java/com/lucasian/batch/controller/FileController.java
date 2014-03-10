package com.lucasian.batch.controller;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;

import java.util.*;

import java.io.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/file")
public class FileController {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    @Qualifier("resumenJob")
    private Job resumenJob;

    @Autowired
    @Qualifier("detalleJob")
    private Job detalleJob;

    @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody String uploadFile(@RequestParam MultipartFile file) throws Exception {
        File dest = File.createTempFile("lucasian1B", ".xlsx");

        file.transferTo(dest);

        jobLauncher.run(resumenJob, new JobParametersBuilder()
                 .addString("inputResource", "file:" + dest.getAbsolutePath())
                 .addString("csvDirectory", "/tmp/")
                 .addString("csvFile", "resumen.csv")
                 .addDate("currentRun", new Date())
                 .toJobParameters());

        return "Hola mundo";
    }

    @RequestMapping(value = "/uploadDetail", method = RequestMethod.POST, produces = "application/json")
    public @ResponseBody String uploadDetailFile(@RequestParam MultipartFile file) throws Exception {
        File dest = File.createTempFile("lucasian1C", ".xlsx");

        file.transferTo(dest);

        jobLauncher.run(detalleJob, new JobParametersBuilder()
                 .addString("inputResource", "file:" + dest.getAbsolutePath())
                 .addString("csvDirectory", "/tmp/")
                 .addString("csvFile", "detalle.csv")
                 .addDate("currentRun", new Date())
                 .toJobParameters());

        return "Hola mundo";
    }

}
