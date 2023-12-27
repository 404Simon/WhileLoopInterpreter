# Run it
`java -jar WHILEParser.jar <whileprogram> <x1Value> <x2Value> ...`

# Build it
## create parser with antlr
`antlr4 -package parser.grammar  -o main/java/parser/grammar -no-listener -visitor Loop.g4`

## create executable
`mvn clean compile assembly:single`

# Language Example
`//addWithWhile.txt
x0 = x2; // this is a comment
WHILE x1 != 0 DO
x0 = x0 +1;
x1 = x1 - 1;
END`

`//mulWithLoop.txt
z1 = x1;
z2 = x2;
x0 = 0;
y0 = 1;
LOOP z2 DO
    x1 = z1;
    x2 = y0 - 1;
    x3 = x0;
    y10 = y0;
    z11 = x1;
    z12 = x3;
    x0 = x1;
    y0 = 1;
    LOOP z12 DO
        x1 = z11;
        x2 = y0 - 1;
        x3 = x0;
        x0 = x3 + 1;
        y0 = y0 + 1;
    END
    y0 = y10;
    y0 = y0 + 1;
END`
