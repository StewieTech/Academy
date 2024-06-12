// package com.bptn.course._01_variables;

public class VariableOperations {
    public static void main(String[] args) {
      int a = 1;
      int b = 2;
      int add = a+b;
      int sub = a - b;
      int mul = a * b;
      int div = a / b;
    System.out.print(a " ,",b,add);
    }
}

"""
    

[`System.out.printf(String format, Object... args)`](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/io/PrintStream.html#printf(java.lang.String,java.lang.Object...))

Writes a formatted string to this output stream using the specified format string and arguments.

Parameters:
- `format` - A format string as described in [Format string syntax](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Formatter.html#syntax)
- [`args`](command:_github.copilot.openSymbolFromReferences?%5B%7B%22%24mid%22%3A1%2C%22path%22%3A%22%2FC%3A%2FUsers%2FErrol%2FDropbox%2FHarvard%20CS50%2FObsidi%2FAcademy%2F1Week%2Fjava_essentials_two%2Fsrc%2Fhelpful%2Fleet%2FVariableOperations.java%22%2C%22scheme%22%3A%22file%22%7D%2C%7B%22line%22%3A3%2C%22character%22%3A37%7D%5D "Academy/1Week/java_essentials_two/src/helpful/leet/VariableOperations.java") - Arguments referenced by the format specifiers in the format string. If there are more arguments than format specifiers, the extra arguments are ignored. The number of arguments is variable and may be zero. The maximum number of arguments is limited by the maximum dimension of a Java array as defined by [The Java™ Virtual Machine Specification](https://docs.oracle.com/javase/specs/jvms/se14/html/). The behaviour on a `null` argument depends on the [conversion](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Formatter.html#dt).
""";