package com.example.dropboxclone.service;

import com.example.dropboxclone.model.FileMetadata;
import com.example.dropboxclone.repository.FileMetadataRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class FileService { // ✅ class name matches file name

    private final Path root;
    private final FileMetadataRepository repository;

    public FileService(FileMetadataRepository repository, @Value("${file.upload-dir}") String uploadDir) throws IOException {
        this.repository = repository;
        this.root = Paths.get(uploadDir);
        Files.createDirectories(root);
    }

    public void store(MultipartFile file) throws IOException {
        Path dest = root.resolve(file.getOriginalFilename());
        Files.copy(file.getInputStream(), dest, StandardCopyOption.REPLACE_EXISTING);
        FileMetadata meta = new FileMetadata();
        meta.setFilename(file.getOriginalFilename());
        meta.setContentType(file.getContentType());
        meta.setSize(file.getSize());
        meta.setUploadTime(LocalDateTime.now());
        repository.save(meta);
    }

    public List<FileMetadata> listAll() {
        return repository.findAll();
    }

    public Path load(String filename) {
        return root.resolve(filename);
    }
}
