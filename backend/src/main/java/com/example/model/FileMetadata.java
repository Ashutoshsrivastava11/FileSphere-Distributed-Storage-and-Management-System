package main.java.com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class FileMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_type")
    private String fileType;

    @Lob
    @Column(name = "data", columnDefinition = "BLOB")
    private byte[] data;

    // Getters and Setters
}
