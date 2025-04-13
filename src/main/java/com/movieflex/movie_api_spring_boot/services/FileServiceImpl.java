package com.movieflex.movie_api_spring_boot.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {

        // Getting the name and path of the file
        String fileName = file.getOriginalFilename();
        String filePath = path + File.separator + fileName;

        // Creating a file object
        File f = new File(path);

        if(!f.exists()){
            f.mkdir();
        }

        // Copy the file or Upload file to the path
        Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);

        return fileName;
    }

    @Override
    public InputStream getResourceFile(String path, String fileName) throws FileNotFoundException {

        String filePath = path + File.separator + fileName;

        return new FileInputStream(filePath);

    }
}
