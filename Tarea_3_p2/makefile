
JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		  Tarea.java \
		  Hebras.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	rm *.class
	
run:
	java Tarea