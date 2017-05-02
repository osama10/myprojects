import matplotlib.pyplot as plt;

plt.rcdefaults()
import numpy as np
import matplotlib.pyplot as plt

objects = ('App Name', 'OS', 'Sha Keys', 'Paths')
files_name = ["app_name_cleaned.txt" , "sha_key_cleaned.txt" , "OS_cleaned.txt" , "paths_cleaned.txt"]
data = []
performance = []

y_pos = np.arange(len(objects))
for file in files_name:
    data = []
    file_read = open(file, "r")
    for line in file_read:
        data.append(line)

    performance.append(len(data))

plt.bar(y_pos, performance, align='center', alpha=0.5)
plt.xticks(y_pos, objects)
plt.ylabel('Frequency')
plt.title('Features Frequencies of GCalculator')

plt.show()

