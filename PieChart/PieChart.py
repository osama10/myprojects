import matplotlib.pyplot as plt;
plt.rcdefaults()
import matplotlib.pyplot as plt

# Data to plot
objects = ('App Name', 'OS', 'Sha Keys', 'Paths')
files_name = ["app_name_cleaned.txt" , "sha_key_cleaned.txt" , "OS_cleaned.txt" , "paths_cleaned.txt"]
data = []
performance = []

for file in files_name:
    data = []
    file_read = open(file, "r")
    for line in file_read:
        data.append(line)

    performance.append(len(data))
colors = ['gold', 'yellowgreen', 'lightcoral', 'lightskyblue']
explode = (0.1, 0, 0, 0)  # explode 1st slice

# Plot
plt.pie(performance, explode=explode, labels=objects, colors=colors,
        autopct='%1.1f%%', shadow=True, startangle=140)

plt.axis('equal')
plt.show()