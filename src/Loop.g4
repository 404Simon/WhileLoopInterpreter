grammar Loop;
start: prog EOF;
VAR: ('x'|'y'|'z') INT;
expr: var=VAR '+' num=INT #Plus
    | var=VAR '-' num=INT #Minus
    ;
asrt: var=VAR '=' ex=expr ';' #Ex
    | varTo=VAR '=' varFrom=VAR ';' #Va
    | var=VAR '=' num=INT ';' #Num
    ;
prog: asrt #Asert
    | 'LOOP' var=VAR 'DO' p=prog 'END' #Loop
    | 'WHILE' var=VAR '!=' c=INT 'DO' p=prog 'END' #While
    | prog prog #ProgProg
    ;

INT: [0-9]+ ;
NEWLINE : [\r\n]+ -> skip;
LEER: ' ' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;