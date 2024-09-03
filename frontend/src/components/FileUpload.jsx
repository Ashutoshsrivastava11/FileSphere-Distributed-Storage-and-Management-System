import React, { useState } from 'react';

const FileUpload = () => {
    const [selectedFile, setSelectedFile] = useState(null);

    const handleFileChange = (event) => {
        setSelectedFile(event.target.files[0]);
    };

    const handleFileUpload = async () => {
        const formData = new FormData();
        formData.append('file', selectedFile);

        try {
            const response = await fetch('/api/files/upload', {
                method: 'POST',
                body: formData
            });
            if (response.ok) {
                alert('File uploaded successfully');
            } else {
                alert('Error uploading file');
            }
        } catch (error) {
            console.error('Error:', error);
            alert('Error uploading file');
        }
    };

    return (
        <div>
            <input type="file" onChange={handleFileChange} />
            <button onClick={handleFileUpload}>Upload</button>
        </div>
    );
};

export default FileUpload;
