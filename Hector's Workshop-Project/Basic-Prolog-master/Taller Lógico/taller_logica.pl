%Taller programación lógica
%p.1
prerreq(pensamiento_algoritmico, estructuras_de_datos).
prerreq(pensamiento_algoritmico, bases_de_datos).
prerreq(administracion_de_bases_de_datos,bases_de_datos).
prerreq(estructuras_de_datos, programacion_en_la_web).
prerreq(bases_de_datos, programacion_en_la_web).
prerreq(comunicaciones_y_redes, programacion_en_la_web).
prerreq(programacion_en_la_web,web_services).
%p.2
antes(Z,Y):- prerreq(Z,X),prerreq(X,Y).

%p.3
caminos(Z,Y,[Z,Y]):-
	%caminos(Z,Y,[Z,Y],R)
    prerreq(Z,Y)
.

caminos(Z,V,[Z|Cola]):-
    prerreq(Z,Y),
    	caminos(Y,V,Cola)
.

%caminos1(Z,Y,R):- caminos1(Z,Y,R,[]).	
%caminos1(Z,Y,[Z|Cola],R):- prerreq(Z,P),(not(membe