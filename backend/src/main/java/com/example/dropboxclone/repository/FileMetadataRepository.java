package com.example.dropboxclone.repository;

    import com.example.dropboxclone.model.FileMetadata;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface FileMetadataRepository extends JpaRepository<FileMetadata, Long> {
        FileMetadata findByFilename(String filename);
    }