grammar Car;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;
	import co.edu.javeriana.car.interprete.*;
}
@parser::members{
	Map<String, Object> symbolTable = new HashMap <String, Object>();
	
	private Car car;

	public CarParser(TokenStream input, Car car) {
    	this(input);
    	this.car = car;
	}
}
program: 
	{
		List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String, Object> symbolTable = new HashMap<String, Object>();
	}
		(sentence{body.add($sentence.node);})*
		{
			for(ASTNode n : body){
				n.execute(symbolTable);
			}
		};
		
go returns [ASTNode node]: GOTO expression
	{ $node = new Move_fw($expression.node,car);};

back returns [ASTNode node]: BACK expression
	{$node=new Move_bk($expression.node,car);};
	
der returns [ASTNode node]: DERECHA expression
	{$node=new Turn_rt($expression.node,car);};
	
izq returns [ASTNode node]: IZQUIERDA expression
	{$node=new Turn_lt($expression.node,car);};
color returns [ASTNode node]: COLOR rgb =expression COMA valor = expression
{
	int red =Integer.valueOf($rgb.text.substring(1,3),16);
	int green = Integer.valueOf($rgb.text.substring(3,5),16);
	int blue =Integer.valueOf($rgb.text.substring(5,7),16);
	
	$node = new Setcolor(red,green,blue,$valor.node, car);
} ;
		
sentence returns [ASTNode node]:  
					conditional{$node = $conditional.node;}
				|var_decl {$node = $var_decl.node;}
				|var_assign{$node=$var_assign.node;} 
				|go{$node=$go.node;}
				|back{$node=$back.node;}
				|der{$node=$der.node;}
				|izq{$node=$izq.node;}
				|color{$node=$color.node;}
				|println{$node = $println.node;}
				|println2 {$node = $println2.node;}
				|whileexpression {$node = $whileexpression.node;}
				|decl_funcion {$node = $decl_funcion.node;}
				|use_function {$node = $use_function.node;};


var_decl returns [ASTNode node]:

 VAR (ID {$node = new VarDecl($ID.text);}|var_assign {$node = $var_assign.node;});

var_assign returns [ASTNode node]:
  ID ASSIGN expression  {$node = new VarAssign($ID.text,$expression.node);};


//{symbolTable.put($ID.text,$expression.value);};
println returns [ASTNode node]: PRINTLN expression 
			{$node= new Println($expression.node);};
			
			
println2 returns [ASTNode node]:PRINTLN cadena
			{$node = new Println2($cadena.node);};

cadena returns [ASTNode node]:
			
			CADENA{$node = new Cadena($CADENA.text);} ;
			
decl_funcion returns [ASTNode node]:

			FUNCION ID{String nombre = $ID.text;}
			{
				List<ASTNode> body = new  ArrayList<ASTNode>();
				List<String> arguments = new ArrayList<String>(); 
			}
			PAROPEN ((arg1 = argumentos {arguments.add($arg1.text);}
				(COMA arg2=argumentos {arguments.add($arg2.text);})*)*) 
				   PARCLOSE(sentence{body.add($sentence.node);})* END
			
			{
				{$node = new Function2(arguments,body,nombre);}
			};

use_function  returns [ASTNode node]: ID  {String nombre = $ID.text;}
				{
					List<ASTNode> arguments = new  ArrayList<ASTNode>(); 
				}
				PAROPEN 
			
					((arg1 = argumentos {arguments.add($arg1.node);}
					(COMA arg2=argumentos {arguments.add($arg2.node);})*)*) 
					
				PARCLOSE
				{
					{$node = new Function2call(nombre,arguments);}
				} ;
			 

argumentos returns [ASTNode node]:
				 NUMBER {$node = new Constant(Float.parseFloat($NUMBER.text));} 
				|ID{$node= new VarDecl($ID.text);}
				|BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));};

conditional returns [ASTNode node]: IF PAROPEN supercondicion PARCLOSE
			
			{
				List<ASTNode> body = new ArrayList<ASTNode>();
				List<ASTNode> elseBody = new ArrayList<ASTNode>();
			}
			 (s1=sentence{body.add($s1.node);})* 
			(
			ELSE 
			
			(s2=sentence{elseBody.add($s2.node);})*)? ENDIF
			{
				$node = new If($supercondicion.node, body, elseBody);	
			};


supercondicion returns [ASTNode node]: 
	t1 = condicion { $node = $condicion.node;}
		(
		 AND t2 = condicion 
		{$node = new AND($node,$t2.node);}
		
		| OR t2 = condicion 
		{$node = new OR($node,$t2.node);}	
	)*;

whileexpression returns [ASTNode node]:
		WHILES PAROPEN condicion PARCLOSE 
		{
			List<ASTNode> body = new ArrayList<ASTNode>();
		}
		
		(s1=sentence{body.add($s1.node);})* ENDWHILE
		{
			$node = new WhileExpress($condicion.node,body);
		};
		
condicion returns [ASTNode node]:
    	t1 = expression {$node = $t1.node;}
    		(
    			
		        GT t2 = expression
		        {$node = new GT($node, $t2.node);}
		
		        | LT t2 = expression
		        {$node = new LT($node, $t2.node);}
		
		        | LEQ t2 = expression
		        {$node = new LEQ($node, $t2.node);}
		
		        | GEQ t2 = expression
		        {$node = new GEQ($node, $t2.node);}
		
		        | NEQ t2 = expression
		        {$node = new NEQ($node, $t2.node);}
		
		        | EQ t2 = expression
		        {$node = new EQ($node, $t2.node);}
		        
		    )*;
		    

expression returns [ASTNode node]:
t1=factor {$node = $t1.node;}
		(PLUS t2=factor{$node = new Addition ($node, $t2.node);} |
		MINUS t2=factor{$node = new Substraction($node, $t2.node);})*;

factor returns [ASTNode node]:
	t1=term {$node = $t1.node;}
	(MULT t2=term {$node = new Multiplication ($node, $t2.node);}|
	 DIV t2=term {$node = new Division ($node, $t2.node);})*;


term returns [ASTNode node]:
	 NUMBER {$node = new Constant(Float.parseFloat($NUMBER.text));} 
	|ALPHA {$node = new Constant(Float.parseFloat($ALPHA.text));}
	|ID{$node= new VarRef($ID.text);}
	|BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text)); }
	|PAROPEN expression{$node = $expression.node;}PARCLOSE;

PROGRAM : 'program';
VAR:'def_var';
PRINTLN:'echo';
IF: 'if';
ENDIF:'endif';
ELSE: 'else';
WHILES:'while';
ENDWHILE:'endwhile';
FUNCION:'proc';
END:'end';
PUNTO:'.';

GOTO:'move_fw';
BACK:'move_bk';
DERECHA:'turn_rt';
IZQUIERDA:'turn_lt';
COLOR:'set_rgba';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

//INVERSO ADITIVO

AND: '&&';
OR: '||';
NOT: '!=';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '=';
NEQ: '<>';

ASSIGN: ':=';

DOTS: ':';
SEMICOLON: ';';
COMA: ',';
BRAOPEN: '{';
BRACLOSE: '}';
PAROPEN: '(';
PARCLOSE: ')';


BOOLEAN:'true'|'false';
ID: [#a-zA-Z_][a-zA-Z0-9_]*;
CHAR:[a-z];
NUMBER:[0-9]+[.]?[0-9]?;
ALPHA:[0-1][.][0-9];
CADENA:["][a-zA-Z][a-zA-Z" "]*["]; 

WS:[ \t\r\n]+ -> skip ;