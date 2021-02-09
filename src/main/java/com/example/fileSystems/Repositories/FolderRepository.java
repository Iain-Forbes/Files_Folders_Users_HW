package com.example.fileSystems.Repositories;

import com.example.fileSystems.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
