# Run the interpreter
`java -jar WHILEParser.jar <whileprogram> <x1Value> <x2Value> ...`

# Build it yourself
## parse with antlr
`antlr4 -package parser.grammar  -o main/java/parser -no-listener -visitor grammar/Loop.g4`

## create executable
`mvn clean compile assembly:single`