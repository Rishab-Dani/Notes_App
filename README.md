Description:
A simple text-based notes manager built in Java using File I/O. It allows users to add and view notes directly from the terminal, storing all notes in a text file.

How I Built It:

Menu System: Implemented a loop-based menu to let users choose between adding notes, viewing notes, or exiting the app.

Adding Notes: Used FileWriter in append mode to store each new note in notes.txt without overwriting existing notes.

Viewing Notes: Used FileReader and BufferedReader to read the file line-by-line and display saved notes in the terminal.

Error Handling: Added friendly error messages for cases like missing files or I/O issues.

Code Structure: Organized logic into small methods (addNote(), viewNotes()) for readability and easier maintenance.

File Management: Used try-with-resources to ensure files are closed automatically after each operation.

Tools & Technologies:

Java (Core Concepts, FileReader, FileWriter, BufferedReader, Exception Handling)

VS Code (Editor)

Terminal (Running & Testing)

Key Learnings:

How to use Java File I/O for persistent data storage.

Importance of append mode to preserve file content.

Structuring console-based apps for usability and clarity.
