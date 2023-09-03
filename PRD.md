Requirements Analysis
1. User can provide a file name in Google drive and the service would be able to find the file in Google drive with that name.
1.1 If the file is present, then the file would be downloaded in the system.
1.2 If the file is not present, then an error would be thrown to the user with the status code - Resource not found exception

2. User can provide a word or term to be searched in all the files in Google Drive. The system should find out all the file names
containing that word. If there are more than P number of files, then the results must be paginated.



Non Functional Requirements
1. If there are a large number of files containing the searched token or word, then the results must be paginated. This would be required
   to control the memory usage of the application
2. The application should emit enough logs so that debugging the application would be easy.
3. 
