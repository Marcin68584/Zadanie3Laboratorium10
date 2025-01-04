# CopyFileAuto - Application for Copying Files and Replacing Spaces with Hyphens

## Description
The **CopyFileAuto** application reads the content of a text file (`input.txt`), replaces all spaces with hyphens (`-`), and then saves the modified content to a new file (`output.txt`). The program automatically opens files for reading and writing, and handles input/output exceptions.

## How the Program Works
1. The program opens the file `input.txt` for reading and `output.txt` for writing.
2. It processes each byte in the input file:
   - If it encounters a space (`' '`), it replaces it with a hyphen (`'-'`).
   - If it encounters any other character, it writes it to the output file unchanged.
3. After processing is complete, the `output.txt` file contains the data from `input.txt` with spaces replaced by hyphens.

## How to Run the Application

1. **Clone the repository to your computer:**
   ```bash
   git clone https://github.com/your-repository.git
