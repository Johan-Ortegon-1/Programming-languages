# vertices = [[0, 1, 1, 0],
#             [0, 0, 1, 0],
#             [0, 0, 0, 1],
#             [0, 0, 0, 0]]
# edges =  [[0, 3, 4, 0],
#           [0, 0, 0.5, 0],
#           [0, 0, 0, 1],
#           [0, 0, 0, 0]]


def generar_matriz_inicial(tam):
    global vertices
    global edges
    vertices = [[0 for i in range(tam)] for j in range(tam)]
    edges = [[0 for i in range(tam)] for j in range(tam)]


def read_file():
    global vertices_global
    global vertices
    global edges
    cont = 0
    f = open("in.txt", "r")
    lines = f.readlines()
    for line in lines:
        print(line)
        if cont == 0:
            fragments = line.split(" ")
            print(fragments)
            fragments[-1] = fragments[-1].strip()
            for index in fragments:
                vertices_global.append(index)
            #  Inicializar matrices de vertices y aristas.
            generar_matriz_inicial(len(vertices_global))
        else:
            fragments = line.split("-")
            fragments[-1] = fragments[-1].strip()
            position1 = vertices_global.index(fragments[0])
            position2 = vertices_global.index(fragments[1])
            weight = fragments[2]
            vertices[position1][position2] = 1
            edges[position1][position2] = float(weight)

        cont += 1
    f.close()

vertices_global = []
vertices = [[]]
edges = [[]]

read_file()
vertices_global[-1] = vertices_global[-1].strip()
print("Vertices:", vertices_global)
print("Vertices matrix:", vertices)
print("Aristas matrix:", edges)
