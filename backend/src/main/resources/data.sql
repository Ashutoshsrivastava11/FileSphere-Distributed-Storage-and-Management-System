-- Insert initial data into the files table
INSERT INTO files (file_name, file_type, data) VALUES 
('example1.txt', 'text/plain', decode('54686973206973206120746573742066696c6520636f6e74656e74', 'hex')),
('image1.png', 'image/png', decode('89504E470D0A1A0A0000000D49484452000000010000000108060000001F15C4890000000C4944415408D763F8000C030D00070502064C0C0C0C0C0C0C0C0C', 'hex'));

-- Notes: The 'decode' function is used to insert binary data in a portable way
-- 'decode' converts hex-encoded strings to binary format. 
-- Use any suitable hex string to represent your binary data.
