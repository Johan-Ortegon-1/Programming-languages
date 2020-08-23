grammar Car;

@parser::members {

private Car car;

public CarParser(TokenStream input, Car car) {
    this(input);
    this.car = car;
}
}

//VARIABLES PARA EL PROYECTO 

program: PROGRAM BRACKETS_OPEN 
		instrucciones*
		BRACKETS_CLOSE;

instrucciones: (go | back | der | izq | color) PUNTOCOMA;

go: GOTO numero
	{car.forward((Float) $numero.value);};
back: BACK numero
	{car.backwards((Float) $numero.value);};
der: DERECHA numero
	{car.right((Float) $numero.value);};
izq: IZQUIERDA numero
	{car.left((Float) $numero.value);};
color: COLOR red=numero COMA green=numero COMA blue=numero COMA alpha=numero
	{car.color((Float) $red.value,(Float) $green.value,(Float) $blue.value,(Float) $alpha.value);};
	
numero returns [Object value]:
		NUMBER{$value = Float.parseFloat($NUMBER.text);};


COMA:',';

GOTO:'move_fw';
BACK:'move_bk';
DERECHA:'turn_rt';
IZQUIERDA:'turn_lt';
COLOR:'set_rgba';

//VARIABLES DE LOS TUTORIALES
PROGRAM:'program';

MAS:'+';
MENOS:'-';
MULTI:'*';
DIV:'/';

AND:'&&';
OR:'||';
NOT:'!';

MAYOR:'>';
MENOR:'<';
IGUAL:'==';
MAY_I:'>=';
MEN_I:'<=';

ASIGNAR:'=';

BRACKETS_OPEN:'{';
BRACKETS_CLOSE:'}';

PAR_OPEN:'(';
PAR_CLOSE:')';

PUNTOCOMA:';';

ID:[a-zA-Z_][a-zA-Z0-9_]*;
NUMBER:[0-9]+;

WS: [ \t\r\n]+ -> skip;