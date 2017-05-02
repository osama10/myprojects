files_name = ["app_name.txt" , "sha_key.txt" , "OS.txt" , "paths.txt"] #feature files name before cleaning
files_name_cleaned = ["app_name_cleaned.txt" , "sha_key_cleaned.txt" , "OS_cleaned.txt" , "paths_cleaned.txt"] #feature files name after cleaning
count = 0
data = []

for file in files_name:

    data = []
    file_read = open(file, "r")
    for line in file_read:
        data.append(line)
        print(line)
    file_read.close()
    data = list(set(data))
    file_write = open(files_name_cleaned[count], "w")
    for l in data:
        print(l)
        file_write.write(l)
    file_write.close()
    count+=1
