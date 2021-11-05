FILE = TempConv

build: $(FILE).s
	gcc -Wall -g $(FILE).s -o $(FILE) -lm -fno-pie -no-pie
	#gcc -Wall -g $(FILE).s -o $(FILE) -lm

.PHONY: db

db:
	gdb -tui $(FILE)

run:
	./$(FILE)