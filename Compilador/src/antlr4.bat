antlrPath=$(find $PWD -name antlr-4.11.1-complete.jar | head -n 1)
SET CLASSPATH=.;antlrPath;%CLASSPATH%
java org.antlr.v4.Tool %*
