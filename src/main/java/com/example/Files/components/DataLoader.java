package com.example.Files.components;

import com.example.Files.Repositories.FileRepository;
import com.example.Files.Repositories.FolderRepository;
import com.example.Files.Repositories.UserRepository;
import com.example.Files.models.File;
import com.example.Files.models.Folder;
import com.example.Files.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements ApplicationRunner {


    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Folder picsFolder = new Folder("Pictures");
        folderRepository.save(picsFolder);
        File picture = new File("Test", "JPEG", 10, picsFolder);
        fileRepository.save(picture);
        User photographer = new User("Mr Photo Man");
        userRepository.save(photographer);



    }
}
