def check(email):
    particion = email.split("@")
    caracteres = "~!@#$%^&*()-+?=+;<>/\\\"',|{}[]:\'¿→¶ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤ÁÂÀ©╣║╗╝¢¥┐└┴┬├─┼ãÃ╚╔╩╦╠═╬¤ðÐÊËÈıÍÎÏ┘┌█▄¦Ì▀ÓßÔÒõÕµþÞÚÛÙýÝ¯´≡±‗¾¶§÷¸°¨·¹³²■"
    if len(particion) != 2:
        print("Invalid Email")
        return
    if ("." not in particion[1]) | (".." in particion[1]) | (particion[1][0] == ".") | (
            particion[1][len(particion[1]) - 1] == "."):
        print("Invalid Email")
        return
    for iter in caracteres:
        if (iter in particion[0]) | (iter in particion[1]):
            print("Invalid Email")
            return
    print("Valid email")


email = "Madfjkq@..h..otakld.dfq.eqe.de"
check(email)

email = "Madfjkq@hotakld.dfq.eqe.de"
check(email)

email = "AaAnkitrai326@a.com"
# calling run function
check(email)

email = "my.ownsite@ourearth.org"
check(email)

email = "ankitrai326.com"
check(email)

email = "Madfjkq@hotakld.dfq.eqe.de."
check(email)

email = "Madfjkq@hotakld.dfq.eqe..de"
check(email)

