package com.example.Files.Controllers;


import com.example.Files.Repositories.FileRepository;
import com.example.Files.models.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FileController {

    @Autowired
    FileRepository FileRepository;

    @GetMapping("/files")
    public ResponseEntity<List<File>> getAllFile() {
        List<File> allFiles = FileRepository.findAll();
        return new ResponseEntity<>(allFiles, HttpStatus.OK);
    }


    @GetMapping("files/{id}")
    public ResponseEntity<Optional<File>> getFileByID(@PathVariable Long id){
        return new ResponseEntity<>(FileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/files")
    public ResponseEntity<File> createFile(@RequestBody File file){
        FileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }

}
