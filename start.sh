#!/bin/bash
export CLASSPATH=target/aws-sqs-consomer-1.0-SNAPSHOT.jar
export className=App
echo "## Running $className..."
shift
mvn exec:java -Dexec.mainClass="br.com.julioneto.sqsconsomer.$className"