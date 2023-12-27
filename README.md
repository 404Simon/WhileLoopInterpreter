# Run the interpreter
`java -jar WHILEParser.jar <whileprogram> <x1Value> <x2Value> ...`

# Build it yourself
## create parser with antlr
`antlr4 -package parser.grammar  -o main/java/parser/grammar -no-listener -visitor Loop.g4`

## create executable
`mvn clean compile assembly:single`