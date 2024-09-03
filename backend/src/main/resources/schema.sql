-- Create table for storing file metadata
CREATE TABLE files (
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    file_name VARCHAR(255) NOT NULL,
    file_type VARCHAR(100),
    data BYTEA NOT NULL
);

-- Add a unique constraint on file_name to prevent duplicate file names
ALTER TABLE files ADD CONSTRAINT unique_file_name UNIQUE (file_name);

-- Add a check constraint to ensure file_type is not null when data is present
ALTER TABLE files ADD CONSTRAINT check_file_type CHECK (file_type IS NOT NULL);
