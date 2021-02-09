package com.example.fileSystems.Controllers;

import com.example.fileSystems.Repositories.FolderRepository;
import com.example.fileSystems.models.Folder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class FolderController {

    @Autowired
    FolderRepository FolderRepository;

    @GetMapping("/folder")
    public ResponseEntity<List<Folder>> getAllFolders() {
        List<Folder> allFolders = FolderRepository.findAll();
        return new ResponseEntity<>(allFolders, HttpStatus.OK);
    }


    @GetMapping("folder/{id}")
    public ResponseEntity<Optional<Folder>> getFolderByID(@PathVariable Long id){
        return new ResponseEntity<>(FolderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/folders")
    public ResponseEntity<Folder> createFolder(@RequestBody Folder folder){
        FolderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }

}
