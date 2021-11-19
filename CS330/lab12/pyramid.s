.section .data
    inputA: .space 8

.section .rodata
    inputString: .string "Enter an integer: \n"
    scanfString: .string "%d"
    starString: .string "*"
    newlineString: .string "\n"

.text
.global main

# Intialization function for _printStar
printStar:

# Moves rbx into r12 so rbx value does not get altered 
movq %rbx, %r12
# Moves 0 into r11 for comparison
movq $0, %r11

# Jumps to _printStar after intialization
jmp _printStar

_printStar:

# Decrements r12
dec %r12

# Prints the star once
movq $starString, %rdi
xor %rax, %rax
call printf

# Compares to see if r11 - r12 is less and 0
cmpq %r12, %r11
# If the comparison sets the sign flag then we go back and redo this entire function
jl _printStar

# Prints a new line for the next set of stars
movq $newlineString, %rdi
xor %rax, %rax
call printf

ret

createPyramid:

# Increments rbx because printStar function uses rbx to print the number of stars
inc %rbx
call printStar
# Moves inputA (user input) into r15 for comparison
movq inputA, %r15

# Compares rbx to r15 and if it is less than 0 you repeat create pyramid
cmpq %r15, %rbx
jl createPyramid

ret


main:

# Preamble
pushq %rbp
movq %rsp, %rbp

# Prints string asking to input first number
movq $inputString, %rdi
xor %rax, %rax
call printf

# Calls scanf by first moving scanfString from previous lab to rdi
# Also allocates space of inputA
movq $scanfString, %rdi
movq $inputA, %rsi
xor %rax, %rax
call scanf

# Set rbx to 0 for initalizing the pyramid
movq $0, %rbx

# Calls createPyramid function
call createPyramid

# Resets stack and returns
movq $0, %rax
leave
ret
