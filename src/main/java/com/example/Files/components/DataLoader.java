package com.example.Files.components;

import com.example.Files.Repositories.FileRepository;
import com.example.Files.Repositories.FolderRepository;
import com.example.Files.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepository pirateRepository;
    @Autowired
    FolderRepository shipRepository;
    @Autowired
    UserRepository raidRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

    }
}
