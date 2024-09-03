package main.java.com.example.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public void storeFile(MultipartFile file) throws IOException {
        FileMetadata fileMetadata = new FileMetadata();
        fileMetadata.setFileName(file.getOriginalFilename());
        fileMetadata.setFileType(file.getContentType());
        fileMetadata.setData(file.getBytes());
        fileRepository.save(fileMetadata);
    }

    public FileMetadata getFile(Long id) {
        Optional<FileMetadata> fileMetadata = fileRepository.findById(id);
        return fileMetadata.orElseThrow(() -> new RuntimeException("File not found with id " + id));
    }

    public List<FileMetadata> getAllFiles() {
        return fileRepository.findAll();
    }

    public void deleteFile(Long id) {
        fileRepository.deleteById(id);
    }
}
