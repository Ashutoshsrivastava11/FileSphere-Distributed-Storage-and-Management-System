# FileSphere: Distributed Storage and Management System
FileSphere is a sleek and scalable distributed file storage solution designed for efficient file management. Built with Java Spring Boot and React, it provides a user-friendly interface and robust backend services.

## 🚀 Features
**Scalable Storage:**
Manage large file volumes with a distributed architecture.

**User-Friendly Interface:**
Simple React frontend for easy file operations.

**Secure Handling:**
Reliable backend services for file security.

**Cross-Origin Support:** 
Easy integration with frontend through CORS configuration.

**Efficient Metadata Management:**
Structured SQL database for file metadata.

## 🛠 Technologies
**Java Spring Boot:**
Backend framework for API development.

**React:**
Frontend library for building dynamic user interfaces.

**SQL:**
Database technology for metadata management.

**CSS:**
Styling for a polished frontend experience.

**JavaScript:**
Adds interactivity to the frontend.


## 🚀 Usage

**Upload Files:**  Use the React frontend to upload files.

**Download Files:**  Retrieve files using their ID.

**List Files:**  View all files via the interface.

**Delete Files:**  Remove files using their ID.



## 🌐 API Endpoints
**Upload File**

POST /api/files/upload

Request: multipart/form-data with file

Response: Success or error message

**Download File**

GET /api/files/{id}

Request: File ID

Response: File content

**List All Files**

GET /api/files/all

Response: List of file metadata

**Delete File**

DELETE /api/files/{id}

Request: File ID

Response: Success or error message
