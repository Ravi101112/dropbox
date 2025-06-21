package com.example.dropboxclone.controller;

    import com.example.dropboxclone.model.FileMetadata;
    import com.example.dropboxclone.service.FileService;
    import org.springframework.core.io.Resource;
    import org.springframework.core.io.UrlResource;
    import org.springframework.http.HttpHeaders;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import org.springframework.web.multipart.MultipartFile;

    import java.io.IOException;
    import java.net.MalformedURLException;
    import java.nio.file.Path;
    import java.util.List;

    @RestController
    @CrossOrigin(origins = "http://localhost:5173")
    public class FileController {
        private final FileService fileService;

        public FileController(FileService fileService) {
            this.fileService = fileService;
        }

        @PostMapping("/upload")
        public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws IOException {
            fileService.store(file);
            return ResponseEntity.ok("Uploaded successfully");
        }

        @GetMapping("/files")
        public List<FileMetadata> listFiles() {
            return fileService.listAll();
        }

        @GetMapping("/files/{filename}")
        public ResponseEntity<Resource> download(@PathVariable String filename) throws MalformedURLException {
            Path file = fileService.load(filename);
            Resource resource = new UrlResource(file.toUri());
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"")
                    .body(resource);
        }
    }