package com.example.fileSystems.components;

import com.example.fileSystems.Repositories.FileRepository;
import com.example.fileSystems.Repositories.FolderRepository;
import com.example.fileSystems.Repositories.UserRepository;
import com.example.fileSystems.models.File;
import com.example.fileSystems.models.Folder;
import com.example.fileSystems.models.User;
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
        User photographer = new User("Mr Photo Man");
        userRepository.save(photographer);
        Folder picsFolder = new Folder("Pictures", photographer);
        folderRepository.save(picsFolder);
        File picture = new File("Test", "JPEG", 10, picsFolder);
        fileRepository.save(picture);




    }
}
