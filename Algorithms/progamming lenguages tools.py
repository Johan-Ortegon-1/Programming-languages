def read_file(file_name):
    file = open(file_name, 'r')
    lines = file.readlines()

    for line in lines:
        print(line)


def string_processing(string1):
    for element in string1:
        print(element, end=' ')
    print()
    for iter in range(0, len(string1)):
        print(string1[iter], end=' ')


read_file("text.txt")
string_processing("patata gorda")
